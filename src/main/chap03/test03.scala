package main.chap03

object test03 {
  def main(args: Array[String]): Unit = {
    println("hi")
    val a = 10
    var b = 20
    b = 50
    println(a)
    println(b)
    val c = 4

    // lazy val 在赋值后直接进行运算
    lazy val d = a*c
    println(d*3)
  }
}
