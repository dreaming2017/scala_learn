package com.bigdata.scala.learn.chapter07

/**
  * 用迭代代替var循环递归
  */
class Breakless2 {

  def search(args: Array[String]) = {
    def searchFrom(i: Int): Int =
      if (i >= args.length) -1
      else if (args(i).startsWith("-")) searchFrom(i + 1)
      else if (args(i).endsWith(".scala")) i
      else searchFrom(i + 1)

    val i = searchFrom(0)
    i
  }

}

object Main {
  def main(args: Array[String]): Unit = {
    val b = new Breakless2
    val index = b.search(Array("-aaaa.txt", "-bbbb.txt", "cccc.scala1"))
    println("index = " + index)
  }
}
