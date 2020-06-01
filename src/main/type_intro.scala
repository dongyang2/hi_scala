// 变量数据类型。学习。
package main

object type_intro {
  def main(args: Array[String]): Unit = {
    val a = 10

    // var 用来申明变量，val 用来申明常量
    var b = 20
    b = 50
    println(a)
    println(b)
    val c = 4

    // lazy val 在赋值后直接进行运算
    lazy val d = a*c
    println(d*3)

    val e:Byte = 100
    val f:Int = 1000000000
    val g:Long = 1000000000
    val h:Float = 1000000000
    val i:Double = 1000000000
    println(g)
    println(h)  // 这里的输出是科学计数法或者带小数点

    val j = true
    val k = false
    println(k)

    // 字符是单引号
    val l_1 = 'a'
    // 字符串直接搞个双引号就可以了
    val l = "ni hao"
    println(l)
    // 还有一个多行字符串，类似 Python
    val l1 = """www.runoob.com"""

    // scala支持字符串差值操作，用 $ 符号和 {} 来直接对常量或变量取值
    val m = s"hi, ${l}"
    println(m)
    var l2 = l
    val m2 = s"Oh, ${l2}!"
    println(m2)

    // 查看类型
    println("type of m2(full name) \t%s".format(m2.getClass))
    println("type of f(simple name) \t%s".format(f.getClass.getSimpleName))


  }
}
