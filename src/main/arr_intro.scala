// 数组。学习。
package main

object arr_intro {
  def main(args: Array[String]): Unit = {
    // 申明 1
    val arr1 = new Array[String](3)

    // 申明 2
    val arr2:Array[String] = new Array[String](2)

    // 申明 3
    var arr3 = Array("Forth", "Fifth", "Sixth")

    // 赋值
    arr1(0) = "zero"
    arr1(1) = "First"
//    arr1(2) = "Sec"

    for (i <- 0 to 2){
      println(arr1(i))
    }

//    // 追加元素
//    cut_line()
//    arr3 += s"Seventh"
//    erg_arr_str(arr3)
//    cut_line()

    arr1(2) = "Sec"
    // 快捷遍历法
    for (elem <- arr1){
      println(elem)
    }

    // foreach遍历法。一行打印
    arr1.foreach(println(_))

    println(arr1.length)

    // 合并数组
    val con_arr = Array.concat(arr1, arr2)
    erg_arr_str(con_arr)

    // 多维数组
    val matrix = Array.ofDim[Int](3,3)
    matrix(0)(0) = 0
    matrix(0)(1) = 4
    matrix(0)(2) = 2
    matrix(1)(0) = 9
    matrix(1)(1) = 8
    matrix(1)(2) = 5
    matrix(2)(0) = 3
    matrix(2)(1) = 1
    matrix(2)(2) = 7

    erg_matrix(matrix)
    cut_line()
    // 按第二列排序
    val sort_matrix = matrix.sortBy(_(1))
    erg_matrix(sort_matrix)
    cut_line()

    // 取前几个元素
    val k:Int = 2
    val first_k_matrix = sort_matrix.take(k)
    erg_matrix(first_k_matrix)
    cut_line()

    // 取第一个
    println("First " +arr3.head)
    // 取最后一个
    println("Last " +arr3.last)

    val f_k_m2 = sort_matrix.take(2)
    erg_matrix(f_k_m2)

    // tuple 直接使用申明
    val tuple1 = (1, -0.5, "abc")
    // tuple 新建对象申明
    val tuple2 = Tuple3(2, -3.0, "edf")
    val tuple3 = Tuple3(0, 0.0, "ghi")

    // 可以利用tuple实现多类型的元素按列进行排序
    cut_line()
    val arr_t = Array(tuple1, tuple2, tuple3)
    println(arr_t.getClass.getSimpleName)
    val sort_arr_t = arr_t.sortBy(_._2)  // 要注意tuple和数组选列的时候下标不一样
    for (i <- sort_arr_t.indices){
      print(sort_arr_t(i) + " ")
      println()
    }

    // tuple的取值方式也不一样
    println(tuple3._3)



//    val nums = Seq(("h",1),("w",2),("e",5),("i",3),("f",4))
//    val nums_sort = nums.sortBy( tuple => tuple._2)
//    for (i <- nums_sort.indices){
//      print(nums_sort(i) + " ")
//      println()
//    }

  }

  def erg_arr_str(arr:Array[String]):Unit={
    // 下标遍历法
    for (i <- arr.indices){
      print(arr(i)+" ")
    }
    println()
  }

  def erg_matrix(matrix:Array[Array[Int]]): Unit ={
    for (i <- matrix.indices){
      for (j <- matrix(0).indices){
        print(matrix(i)(j) + " ")
      }
      println()
    }
  }

  def cut_line(): Unit ={
    println("-*-*-*-*------")
  }
}
