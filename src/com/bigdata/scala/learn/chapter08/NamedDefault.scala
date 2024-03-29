package com.bigdata.scala.learn.chapter08

/**
  * 缺省参数值
  */
object NamedDefault {
  def printTime(out: java.io.PrintStream = Console.out) =
    out.println("time = " + System.currentTimeMillis())

  def printTime2(out: java.io.PrintStream = Console.out,
                 divisor: Int = 1) =
    out.println("time = " + System.currentTimeMillis()/divisor)

  def main(args: Array[String]): Unit = {
    printTime()

    // Calling printTime with an argument specified
    printTime(Console.err)

    // printTime2 can be called many ways
    printTime2()
    printTime2(out=Console.err)
    printTime2(divisor=1000)
    printTime2(out=Console.err, divisor=1000)
  }
}
