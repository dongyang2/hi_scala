/* coding: utf-8 */
// 变量数据类型。学习。
package main
import func_intro.cut_line
import java.text.DecimalFormat

object type_intro {
  def main(args: Array[String]): Unit = {

    /* Number */
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

    val fs = f.toString  // 数字可以直接转为字符串



    /* Boolean */
    val j = true
    val k = false
    println(k)



    /* String */
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
    val m2 = s"Oh, $l2!"  // 新版本scala可以不加大括号
    println(m2)

    cut_line("字符串分割")
    l.split(l_1).foreach(elem => println(elem))
    l2 = "id, title, content"
    l2.split(",").foreach(elem=>println(elem.trim))  // trim()可以去掉字符串的首尾空格
    println(l1.split(",").length)




    /* Util */
    cut_line()
    // 查看类型
    println("type of m2(full name) \t%s".format(m2.getClass))
    println("type of f(simple name) \t%s".format(f.getClass.getSimpleName))

    cut_line()
    // *1.0 可以让结果变成小数
    val sub = (f+e.toInt)*1.0/3
    println(sub)
    println(sub.getClass.getSimpleName)
    // 然后利用Java的decimal format规范输出
    val vale = new DecimalFormat("0.000").format(sub)
    println(vale)


    cut_line()
    val sub2 = i*2/3
    println(format_decimal(sub2))

  }

  def format_decimal(num:Double, num_pat:String="0.00"): String ={
    new DecimalFormat(num_pat).format(num)
  }

}
