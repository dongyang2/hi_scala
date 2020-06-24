/* coding: utf-8 */
// 数组。学习。
package main
import func_intro._

import scala.collection.mutable.ArrayBuffer

object arr_intro {
  def main(args: Array[String]): Unit = {

    /* Array */
    // 申明 1
    val arr1 = new Array[String](3)

    // 申明 2
    val arr2:Array[String] = new Array[String](2)

    // 申明 3
    val arr3 = Array("Forth", "Fifth", "Sixth")

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

    // Array Buffer
    cut_line("可加减元素的数组 ArrayBuffer")
    val arr_b1 = new ArrayBuffer[Int]()
    arr_b1.append(2)  // 添加元素
    arr_b1.insert(1, 3)  // 按下标添加元素
    println(arr_b1)
    arr_b1.remove(1)  // 移除下标为1的元素
    println(arr_b1)
    // Array Buffer 实现的二维数组
    val ab = new ArrayBuffer[ArrayBuffer[String]]()
    for (_ <- 1 to 2){
      val tmp = new ArrayBuffer[String]()
      for (j<- 2 to 4){
        tmp.append(j.toString)
      }
      ab.append(tmp)
    }
    println(ab)

    cut_line("聚合数组为字符串")
    arr_b1.append(9)
    println(arr_b1.mkString(","))



    /* Tuple */
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

    // 数组里如果全是两个元素的tuple，则可以直接toMap
    cut_line()
    val arr4 = Array(("1", 1), ("2", 2), ("3", 3))
    val map1 = arr4.toMap
//    map1.foreach(println)
    println("查看是否转换成功",map1("2"))



    /* Set */
    val se1 = Set(1, 1, 1)
    cut_line("set 不保存重复元素")
    println(se1)

    val se2 = Set(3, 2, 1)  // scala默认的set是不可变set，无法加元素
    cut_line("检查是否存在某元素")
    println(se2.contains(3))
    cut_line("不可变set删除元素")
    val se3 = se2.drop(3)  // drop会返回一个按顺序去掉某些元素的set，但不改变当前set
    println("drop后的新set "+se3)
    println("drop后的老set "+se2)
    println(se2.drop(2))

    // 可变set
    val se4 = scala.collection.mutable.Set(1)
    cut_line("可变set")
    se4.add(3)
    se4.add(3)
    se4.remove(2)  // 按值删除元素
    println(se4)

    // 可变set可以指定元素类型"
    val se5:scala.collection.mutable.Set[String] = scala.collection.mutable.Set()
    se5.add("hi")

    val se6 = scala.collection.mutable.Set("hello", "yo", "hi", "hey")
    se5.add("你好")
    cut_line("set查看交集")
    val and_set = se5.intersect(se6)
    println(and_set)
    println(se5.size)  // 求长度

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


}
