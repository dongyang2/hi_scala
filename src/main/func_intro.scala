// 函数。学习。
package main

object func_intro {
  def main(args: Array[String]): Unit = {
    var s = "Abby"
    println(say_hi(s))

    println(say_hi_again(s))

    println(add_test(1, 2))

    hello_world()
  }

  // 写函数的格式  函数名（参数 ： 参数类型） ： 返回类型 = { 函数内容 }
  def say_hi(name:String):String = {
    // 直接就返回了，不用写return，哈是挺神奇的
    s"Hi! ${name}."
  }

  // 返回类型可以不写，编译可以通过，就是有黄方块
  def say_hi_again(name:String) = {s"Oh, Hi! ${name}, nice to see you."}

  // 大括号在只有一个表达式时可以省略
  def add_test(x:Int, y:Int):Int = x+y

  // 函数输入参数可以设置默认值
  def hello_world(say_hi_to:String="world"): Unit ={
    println(s"Hello! ${say_hi_to}!")
  }

  def cut_line(): Unit ={
    println()
    println("-*_*_*_*_*-"*3)
  }
}
