package com.bigdata.scala.learn.chapter04

object Ex2 {

  /**
    * 定义一个类
    */
  class ChecksumAccumulator {
    //私有的var变量
    private var sum = 0

    //def  add(b : Byte) = sum += b

    def add(b: Byte) = {
      //b =2   不能编译，因为b是一个val
      sum += b
    }

    def checksum(): Int = {
      return ~(sum & 0xFF) + 1
    }
  }


  def main(args: Array[String]) {
    val calc = new ChecksumAccumulator
    calc.add(2)

    println("calc.checksum [" + calc.checksum + "]")
  }
}
