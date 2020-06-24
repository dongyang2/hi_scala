/* coding: utf-8 */
// 文件读写，读命令行界面输入。学习。
package main

import java.io.{File, PrintWriter}

object io_intro {
  def main(args: Array[String]): Unit = {
//    // 写文件

//    val file_write = new PrintWriter(new File("what.txt"))
//    file_write.write("scala io")
//    file_write.close()
    val arr = Array("ho", "Ah", "hey")
    write_file_arr("ha.txt", arr)

    // 读文件
    import scala.io.Source

    val file_read = Source.fromFile("what.txt")
    file_read.foreach{print}  // 这用法真新鲜
    println()
    file_read.close()

//    // 读命令行输入
//    import scala.io.StdIn
//
//    println("Speak out loudly, who is your favorite star?")
//    val line = StdIn.readLine()
//    println(s"OK, your favorite star is ${line}")

    // 读目录
    import java.io.File

    val dir_path = """./"""
    val dir = new File(dir_path)
    val paths = dir.listFiles().filter(_.isDirectory())
    for (p <- paths){
      println(p)
    }
  }

  def write_file_arr(path:String, arr:Array[String]){
    val file_iter_write = new PrintWriter(new File(path))  // 总是会创建新文件，如果已存在该文件，则会进行覆盖写入
    for(i<-arr.indices){
      file_iter_write.write(arr(i)+"\n")
    }
    file_iter_write.close()  // 不加这行写不进去
  }
}
