package com.bigdata.scala.learn.chapter06.ex1

class Rational(n: Int, d: Int) {
  println("Created " + n + "/" + d)
}

object Main{
  def main(args: Array[String]): Unit = {
    new Rational(1, 2)
  }
}
