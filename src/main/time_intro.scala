/* coding: utf-8 */
// 日期操作。学习。

package main

import java.time.LocalDate
import java.util.{Calendar, Date}
import java.text.SimpleDateFormat

import func_intro.cut_line

object time_intro {
  def main(args: Array[String]): Unit = {
//    val aa: Array[String] = get_today()
//    val bb:String = str_join(aa)
//    println(bb)

//    val pattern = "yyyyMMdd"
//    println(get_yesterday(pattern))

//    println(get_n_day_before(18))

    val str = "2020-06-07"
//    string_to_date(str)
    val date_tmp = string_to_date(str)
    println(get_n_day_before_date(date_tmp, 1, "yyyy-MM-dd"))
    cut_line()

    println(get_today_cal())
    cut_line()

    println(get_n_day_after_date(string_to_date(get_today_cal()), 3))
    cut_line()

    println(get_n_day_before_date(string_to_date(get_today_cal()), -1))
  }

  def get_today(): Array[String] ={
    val today = LocalDate.now().toString
    val this_day = today.split("-")
    this_day
  }

  def str_join(s:Array[String]): String ={
    var tmp = ""
    for (i <- s){
      tmp += i
    }
    tmp
  }

  def get_yesterday(pat:String="yyyyMMdd"): String ={
    // pat指返回的日期格式
    val dateFormat = new SimpleDateFormat(pat)
    val calendar = Calendar.getInstance
    calendar.set(Calendar.HOUR_OF_DAY, -24)
    val yesterday = dateFormat.format(calendar.getTime)
    yesterday
  }

  def get_n_day_before(n:Int, pat:String="yyyyMMdd"): String ={
    // 获取若干天前的日期，n指定几天前，pat指定返回的日期格式
    val date_format = new SimpleDateFormat(pat)
    val calendar = Calendar.getInstance
    calendar.set(Calendar.HOUR_OF_DAY, -24*n)
    val the_day = date_format.format(calendar.getTime)
    the_day
  }

  def string_to_date(s: String, pat:String="yyyyMMdd"): Date ={
    // 注意这里的 pat是指定的输入字符串的格式，如果 pat和输入字符串不匹配，可能会出错！
    val date = new SimpleDateFormat(pat).parse(s)
    date
  }

  def get_n_day_before_date(date:Date, n:Int,pat:String="yyyyMMdd"): String ={
    // pat指返回的日期格式
    val calendar = Calendar.getInstance
    calendar.setTime(date)
    calendar.set(Calendar.HOUR_OF_DAY, -24*n)
    val date_format = new SimpleDateFormat(pat)
    val the_day = date_format.format(calendar.getTime)
    the_day
  }

  def get_today_cal(pat:String="yyyyMMdd"): String ={
    // pat指返回的日期格式
    val date_format = new SimpleDateFormat(pat)
    val calendar = Calendar.getInstance
    date_format.format(calendar.getTime)
  }

  def get_n_day_after_date(date:Date, n:Int,pat:String="yyyyMMdd"): String ={
    // pat指返回的日期格式
    val calendar = Calendar.getInstance
    calendar.setTime(date)
    calendar.set(Calendar.HOUR_OF_DAY, 24*n)
    val date_format = new SimpleDateFormat(pat)
    val the_day = date_format.format(calendar.getTime)
    the_day
  }
}
