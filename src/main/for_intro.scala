// 循环语句。学习
package main

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
  }
}
