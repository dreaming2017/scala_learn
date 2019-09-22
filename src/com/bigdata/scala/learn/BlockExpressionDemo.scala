package com.bigdata.scala.learn

/**
  * 块表达式
  */
object BlockExpressionDemo {
  def main(args: Array[String]): Unit = {
    val x = 1
    val y = {
      if (x > 0) 100
      else if (x < 0) -100
      else "error"
    }

    println("y =" + y)
  }
}
