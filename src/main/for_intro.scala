/* coding: utf-8 */
// 循环语句。学习
package main

import scala.util.control.Breaks._
import func_intro.cut_line

object for_intro {
  def main(args: Array[String]): Unit = {
    // scala支持for，while，do while语句
//    var i = 0
    for (i<- 1 to 3){
      print(i+" ")
    }
    println()
    // until是到后面那个数组的前一个
    for(i<-4 until 6){
      print(i+" ")
    }
    println()


    var i = 1
    while (i<3){
      println("abc")
      i+=1

    }

    do{
      println('w')
      i+=1
    }while(i < 4)

//    // break 1.使用 scala.util.control.Breaks.break
//    i = 1
//    while (i<10){
//      println("lala %s".format(i))
//      i+=1
//      // 这里的控制权转移是通过抛出和捕获异常完成的，尽量避免使用这套机制
//      break
//    }

    // break 2.使用 scala.util.control.Breaks.breakable
    cut_line()
    i = 1
    breakable(
      while (i<10){
        if (i==3) {
          break()
        }else{
          println("breakable "+i)
        }
        i+=1
      }
    )

    // break 3.万能方法，任何语言可用
    cut_line()
    var bool_break = true
    i = 1
    while (bool_break){
      if (i==3) {
        bool_break=false
      }else{
        println("the old way "+i)
      }
      i+=1
    }

    cut_line()
    // 局部变量与代码块外部变量
    var count = 0
    var i1 = 0
    while (i1<5){
      count += i1
      i1+=2
    }
    println(count)

  }
}
