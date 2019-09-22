package com.bigdata.scala.learn.chapter06.ex4

class Rational(n :Int,d:Int) {
  require(d !=0)
  override def toString = n + "/" + d
}
//Exception in thread "main" java.lang.IllegalArgumentException: requirement failed
object Main {
  def main(args: Array[String]) {
    new Rational(5, 0)
  }
}
