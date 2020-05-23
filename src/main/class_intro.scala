// 类和对象。学习。
package main

object class_intro {
  def main(args: Array[String]): Unit = {
    var person = new Person("Dongyang2")
    println(person.nam)
    println(person.len_name())
  }
}

class Person(nam0:String){
  var nam:String = nam0
  private var sex:String = ""
  private var birthday:String = ""

  def set_sex(s:String): Unit ={
    this.sex = s
  }
  def set_birthday(birth:String): Unit ={
    this.birthday = birth
  }
  def len_name (): Int ={
    this.nam.length
  }
}