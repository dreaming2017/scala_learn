package com.bigdata.scala.learn.chapter07

object Misc {
  var loopcounter = 2

  def ifVariations(args: Array[String]): Unit = {
    println("args [" + args.toList + "]")

    //指令方式
    {
      var filename = "default.txt"
      if (!args.isEmpty)
        filename = args(0)
      println("filename [" + filename + "]")
    }

    {
      val filename =
        if (!args.isEmpty) args(0)
        else "default.txt"
      println("filename [" + filename + "]")
    }

    println(if (!args.isEmpty) args(0) else "default.txt")

  }

  // 用while循环计算最大公约数
  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  def whileLoop() {
    def readLine() = {
      if (loopcounter > 0) {
        loopcounter -= 1
        "a line"
      } else
        ""
    }

    var line = ""
    do {
      line = readLine()
      println("Read: " + line)
    } while (line != "")
  }

  def shadowing() {
    val a = 1;
    {
      val a = 2 // Compiles just fine
      println(a)
    }
    println(a)
  }

  //这个输出为2
  def shadowing2() {
    val a = 1;
    {
      val a = 2;
      {
        println(a)
      }
    }
  }

  def gcd(x: Int, y: Int): Int = if (y == 0) x else gcd(y, x % y)


  def main(args: Array[String]): Unit = {
    Misc.ifVariations(Array("foo"))
    Misc.ifVariations(Array())

    println("gcdLoop(2, 4) [" + Misc.gcdLoop(2, 4) + "]")
    println("gcdLoop(3, 4) [" + Misc.gcdLoop(3, 4) + "]")

    Misc.shadowing()

    Misc.shadowing2()

   val maxGcd =  Misc.gcd(12,18)
    println("maxGcd = " + maxGcd)
  }
}
