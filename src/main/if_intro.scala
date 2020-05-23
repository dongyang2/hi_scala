// if表达式与逻辑运算符。学习。

package main

object if_intro {
  def main(args: Array[String]): Unit = {
    val a = 20
    if (a==10 || a == 30) {
      println("Not same")
    }else{
      println("same")
    }

//    if (a==20) println("Oh ho")

    val b = 30
    if (a==20 && b==30) println("oh ho")

    val c = 40
    if (c!=40) println("Bye")

    if (a == 10){
      println("a is 10.")
    }else if(a==20){
      println("a is 20.")
    }else{
      println("a is " + a)
    }
  }
}
