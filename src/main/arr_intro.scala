// 数组。学习。
package main

object arr_intro {
  def main(args: Array[String]): Unit = {
    // 申明 1
    var arr1 = new Array[String](3)

    // 申明 2
    var arr2:Array[String] = new Array[String](2)

    // 赋值
    arr1(0) = "zero"
    arr1(1) = "First"
//    arr1(2) = "Sec"

    for (i <- 0 to 2){
      println(arr1(i))
    }

    arr1(2) = "Sec"
    // 快捷遍历方法
    for (elem <- arr1){
      println(elem)
    }

    println(arr1.length)

    // 合并数组
    var con_arr = Array.concat(arr1, arr2)
    erg_arr_str(con_arr)

    // 多维数组
    var matrix = Array.ofDim[Int](3,3)
    matrix(0)(0) = 3
    matrix(0)(1) = 4
    matrix(1)(2) = 5

    for (i <- 0 to 2){
      for (j <- 0 to 2){
        print(matrix(i)(j) + " ")
      }
      println()
    }
  }

  def erg_arr_str(arr:Array[String]):Unit={
    // 下标遍历法
    for (i <- arr.indices){
      print(arr(i)+" ")
    }
    println()
  }
}
