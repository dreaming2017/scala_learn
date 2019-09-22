package com.bigata.scla

/**
  * 元祖的使用
  */
object TupleDemo {
  def main(args: Array[String]): Unit = {
    val pair = (99 ,"Luftballons")

    println(pair._1)
    println(pair._2)
  }
}
