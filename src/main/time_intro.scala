// 日期操作。学习。

package main

import java.time.LocalDate
import java.util.Calendar
import java.text.SimpleDateFormat

object time_intro {
  def main(args: Array[String]): Unit = {
    val aa: Array[String] = get_today()
    val bb:String = str_join(aa)
    println(bb)

    val pattern = "yyyyMMdd"
    println(get_yesterday(pattern))
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
}
