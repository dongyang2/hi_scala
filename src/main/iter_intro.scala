// 迭代器。学习。
package main

object iter_intro {
  def main(args: Array[String]): Unit = {
    var li = Iterator("Runoob", "abc", "oh")

    while (li.hasNext){
      println(li.next())
    }

    // 迭代器自带求最大，最小值
    var it = Iterator(20,40,2,50,69, 100)
    println(it.max)
    println(it.hasNext)  // false，求了最大值或最小值后迭代器将没有值，变为空的迭代器
    println(it)

    // 迭代器有两种方法求长度
    var it2 = Iterator(20,40,2,50,69, 100)
    println(it2.length)
    println(it2.size)


  }
}
