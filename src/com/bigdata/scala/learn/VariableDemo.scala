package com.bigdata.scala.learn

/**
  * 声明变量
  */
object VariableDemo {
  def main(args: Array[String]): Unit = {
    //使用val定义的变量值是不可变的，相当于java里用final修饰的变量
  val str1 = "1234"
    println("str1 = " + str1)

    //使用var定义的变量是可变得，在Scala中鼓励使用val
    var str2 = "haisheng"
    println("str2 = " + str2)

//    str1 = "434343"

     str2 = "王海生"
    println("str2 = " + str2)
  }
}
