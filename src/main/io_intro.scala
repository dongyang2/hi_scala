// 文件读写，读命令行界面输入。学习。
package main

object io_intro {
  def main(args: Array[String]): Unit = {
//    // 写文件
//    import java.io._

//    val file_write = new PrintWriter(new File("what.txt"))
//    file_write.write("scala io")
//    file_write.close()

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

}
