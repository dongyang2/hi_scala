/* coding: utf-8 */
// Map。学习。
package main

import main.func_intro.cut_line

object map_intro {
  def main(args: Array[String]): Unit = {

    // 申明1
    val colors = Map("red" -> "红",
      "azure" -> "天蓝",
      "peru" -> "棕")

    // 申明2
    val numbers:Map[Int, Int] = Map()

    // 取值。和数组一样
    println(colors("azure"))

    // map可以添加键值对，但要注意这里申明时写上var，不能是val
    var count = Map("hi"->1,"hello"->2)
    count += ("yo"->3)
    cut_line()
    println(count)

    // 自带判断空
    cut_line()
    println(numbers.isEmpty)

    // 和Python一样可以取到键的集合
    cut_line()
    println(count.keys.getClass.getSimpleName)
    for (i<-count.keys){
      print(count(i)+"  ")
    }

    // 还能取到值的集合
    cut_line()
    println(count.values)

    // 自带判断是否有该键
    cut_line()
    println(count.contains("wu"))

    // 相同结构的map还能合起来
    cut_line()
    val colors_tmp = Map("purple"->"紫")
    println(colors++colors_tmp)

    cut_line()
    // 想要改变map中任一键对应的值，需要调用或导入下面的这个类
    val count_mul = scala.collection.mutable.Map("hi"->10,"hello"->20)
    count_mul("hi") += 8
    println(count_mul)

    cut_line("get or else")
    val get_or_else_res = count.getOrElse("dx", "ah")
    println(get_or_else_res)



  }
}
