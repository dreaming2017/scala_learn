package com.bigdata.scala.learn.chapter06.ex2

/**
  * 重新实现toString方法
  * @param n
  * @param d
  */
class Rational(n: Int, d: Int) {
  override def toString =  n + "/" + d
}

object Main {
  def main(args: Array[String]) {
    println(new Rational(1, 3))
    println(new Rational(5, 7))
  }
}
