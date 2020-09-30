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
    cut_line("Boolean")
    val j = true
    val k = false
    println(k)



    /* String */
    cut_line("String")
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

    cut_line("字符串查找")
    println(fs)
    println("1".r.findFirstIn(fs))  // 查看有没有
//    println("0".r.findFirstIn(fs))
    println(fs.indexOf("1"))
    println(fs.indexOf("0"))
    val ind1 = l1.indexOf("run")
    println(ind1)
    println(l1.indexOf("a"))

    cut_line("字符串切割")
    val ind2 = l1.indexOf(".", ind1)
    println(l1.substring(ind1, ind2))  // 截取的子串，从ind1开始，到ind2前一个结束
    println(l1.substring(4,4))        // 这种情况返回 ""

    cut_line("字符串替换")
    println(l1.replace(".","-"))
    // scala的replace第一个参数不是正则，但replaceAll和replaceFirst的第一个参数都是正则
    println(l1.replaceFirst(".","-"))




    /* Util */
    cut_line()
    // 查看类型
    println("type of m2(full name) \t%s".format(m2.getClass))
    println("type of f(simple name) \t%s".format(f.getClass.getSimpleName))

    cut_line("整数除法结果转为小数")
    // *1.0 可以让结果变成小数
    val sub = (f+e.toInt)*1.0/3
    println(sub)
    println(sub.getClass.getSimpleName)
    // 然后利用Java的decimal format规范输出
    val vale = new DecimalFormat("0.000").format(sub)
    println(vale)

    val a1 = 10
    val a2 = 15
    println(a1/a2)  // 0
    println(a1/a2.toFloat)  // 0.6666667
//    println(a1.toFloat/a2)  // 和上面一样

    cut_line()
    val sub2 = i*2/3
    println(format_decimal(sub2))

    cut_line("百分比")
    val sub3 = 2*1.0/3
    val val2_percent = java.text.NumberFormat.getPercentInstance.format(sub3)
    println(val2_percent)
    println(get_percent(sub3, "0.0%"))
    println(get_percent(3*1.0/2))

    cut_line("scala允许多个值在一行进行初始化")
    val tmp1, tmp2, tmp3 = Array[String]()
    println(tmp1, tmp2, tmp3)

  }

  def format_decimal(num:Double, num_pat:String="0.00"): String ={
    new DecimalFormat(num_pat).format(num)
  }

  def get_percent(num:Double, pat:String="0.00%"):String={
    val percent_pat = pat.substring(0, pat.length-1)+"00"
    val decimal = format_decimal(num, percent_pat)
    val dot_ind = decimal.indexOf(".")
    if(dot_ind == -1){
      decimal.substring(0, decimal.length-2)
    }else{
      val decimal_front_part = decimal.substring(0,dot_ind)
      if (decimal_front_part == "0"){
        decimal.substring(dot_ind+1, dot_ind+3)+"."+decimal.substring(dot_ind+3)+"%"
      }else{
        decimal_front_part+decimal.substring(dot_ind+1, dot_ind+3)+"."+decimal.substring(dot_ind+3)+"%"
      }
    }
  }
}
