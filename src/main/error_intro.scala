/* coding: utf-8 */
// 自定义异常。
package main

import func_intro.cut_line


object error_intro {
  def main(args: Array[String]): Unit = {
    fun_test("a")
    fun_test("")
    cut_line()

  }

  def fun_test(abc:String){
    if(abc=="a"){
      println("来个a")
    } else if (abc=="b"){
      println("来个b")
    }else{
      throw new FunctionValueError("需要输入合法的参数")
    }

  }

}

class FunctionValueError(s:String="") extends Exception(s){}


