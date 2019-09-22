package com.bigata.scla

import java.math.BigInteger

/**
  * 参数化数组
  */
object Ext2 {
  def main(args: Array[String]): Unit = {

    val greetStrings :Array[String] = new Array[String](3)
    //greetStrings.update(0,"Hello")
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "World!\n"

    //0 to 2 相当于 (0).to(2)
    for (i <- 0 to greetStrings.length - 1)
      println("greetStrings(" + i + ") = " + greetStrings(i))
  }

}
