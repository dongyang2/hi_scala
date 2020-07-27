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
    cut_line("合并数组")
    val con_arr = Array.concat(arr1, arr2)
    println(con_arr)
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

    cut_line("看看空数组在ArrayBuffer里的效果")
    val arr5 = Array[String]()
    println(arr5.isEmpty)
    val ab2 = ArrayBuffer[Array[String]]()
    ab2.append(arr5)
    println(ab2.isEmpty)

    cut_line("其实只是申明了指向数组的类型的指针")
    var arr9 =Array[String]()
    var arr10 = Array[String]()
    arr9 = Array("null")
    arr10 = Array("d", "y")
    arr9.foreach(println)
    arr10.foreach(println)
    arr9 = Array("u8p")
    arr9.foreach(println)

    cut_line("复制某元素99遍")
    val arr11 = Array("a", "b", "c")
    arr11.map(x =>{
      if (x == "b"){
        (0 until 100).map(_=>x).toList
      }else{
        List(x)
      }
    }).foreach(println)



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



    /* Option */
    cut_line("Option")
    val sm1:Option[String] = Some("fast")
    println("值是\t\t类型是\t\n%s\t%s".format(sm1,sm1.getClass.getSimpleName))
    val sm2 = Some(Array("s", "t"))
    val tmp1 = sm2.get  // Array
    println(tmp1, tmp1.getClass.getSimpleName)
    val tmp2 = sm2.getOrElse("")  // :java.io.Serializable
    println(tmp2, tmp2.getClass.getSimpleName)
    val tmp3 = sm2.productElement(0)  // Any
    println(tmp3, tmp3.getClass.getSimpleName)
    println(tmp1(1))
//    println(tmp2(0))  //报错
//    println(tmp3(0))  //报错
    cut_line("Option遍历拿值法")
    val ab_tmp1 = ArrayBuffer[Array[String]]()
    for(elem<-sm2.iterator) ab_tmp1.append(elem)
    println(ab_tmp1.isEmpty)
    println(ab_tmp1(0)(0), ab_tmp1(0)(1))
    val ab_tmp2 = ArrayBuffer[Array[String]]()
    for(elem<-None.iterator) ab_tmp2.append(elem)
    println(ab_tmp2.isEmpty)

    val sm3 = Option("slow")
    println(sm3, sm3.getClass.getSimpleName)
    val sm4 = Option(Array("d","y"))
    val tmp4 = sm4.get
    println(tmp4(0), tmp4(1))

    cut_line("转换拿值法")
    val sm4v = sm4.toVector  // 相当于把Option里面的元素套一个Vector的壳，即换壳
    println(sm4v(0)(0))
    println(sm3.toVector(0))
    val sm5 = Option(Array("d","y"),Array("f","u"))
    val sm5v = sm5.toVector
    println(sm5v(0)._2(1))
    // 测试 None的情况
    val nv = None.toVector
//    println(nv(0))
    println("None to vector的情况",nv.isEmpty)




    /* Util */
    cut_line("ArrayBuffer可以转Array")
    val arr6 = ab.toArray
    println(arr6)
    println(arr6(1))

    cut_line("Array转Set")
    val arr7 = Array(1, 2, 3, 4, 2)
    println(arr7.toSet)

    cut_line("Array的map")
    val arr8 = Array("837|0.0595", "227|0.0575", "50|0.0559")
    arr8.map(elem =>elem.split("\\|")(0)).foreach(println)  //注意带有竖线的分离需要加两个下划线

  }

  def erg_arr_str(arr:Array[String]){
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

  def option_to_arr(op:Option[Array[String]]): ArrayBuffer[Array[String]] ={
    // 把some里的数据拿到。当some为None时，此函数返回的的ab.isEmpty为true
    val ab_tmp = ArrayBuffer[Array[String]]()
    for(elem<-op.iterator) ab_tmp.append(elem)
    ab_tmp
  }

}
