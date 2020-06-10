// 日期操作。学习。

package main

import java.time.LocalDate
import java.util.{Calendar, Date}
import java.text.SimpleDateFormat

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

    println(get_today_cal())
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

  def string_to_date(s: String): Date ={
    val date = new SimpleDateFormat("yyyy-MM-dd").parse(s)
    date
  }

  def get_n_day_before_date(date:Date, n:Int,pat:String="yyyyMMdd"): String ={
    val calendar = Calendar.getInstance
    calendar.setTime(date)
    calendar.set(Calendar.HOUR_OF_DAY, -24*n)
    val date_format = new SimpleDateFormat(pat)
    val the_day = date_format.format(calendar.getTime)
    the_day
  }

  def get_today_cal(pat:String="yyyyMMdd"): String ={
    val date_format = new SimpleDateFormat(pat)
    val calendar = Calendar.getInstance
    date_format.format(calendar.getTime)
  }
}
