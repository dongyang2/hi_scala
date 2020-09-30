/* coding: utf-8 */
// 迭代器。学习。
package main

import main.func_intro.cut_line

object iter_intro {
  def main(args: Array[String]): Unit = {
    val li = Iterator("Runoob", "abc", "oh")

    // next遍历法
//    while (li.hasNext){
//      println(li.next())
//    }

    // 普通遍历法
    println("普通遍历法")
    for (i <- li){
      println(i)
    }

    // 迭代器自带求最大，最小值
    val it = Iterator(20,40,2,50,69, 100)
    println(it.max)
    println(it.hasNext)  // false，求了最大值或最小值后迭代器将没有值，变为空的迭代器
    println(it)

    // 迭代器有两种方法求长度
    val it2 = Iterator(20,40,2,50,69, 100)
    println(it2.length)
    println(it2.size)

    cut_line("用map代替for循环进行字符串拼接")
    val str1 = "C/user/"
    val str_arr = (0 to 3).map(e=>
      (7 to 8).map(n=>
        str1+e.toString+"/"+n
      )
    ).flatten(e=>e)
    str_arr.foreach(println)

  }
}
