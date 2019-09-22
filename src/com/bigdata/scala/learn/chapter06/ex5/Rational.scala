package com.bigdata.scala.learn.chapter06.ex5

class Rational(n: Int, d: Int) {
  require(d != 0)

  override def toString = n + "/" + d

  //编译不能通过
  // def add(that: Rational): Rational = new Rational(n * that.d + d * that.n, d + that.d)

  val numer: Int = n
  val denom: Int = d

  def add(that: Rational): Rational = new Rational(numer * that.denom + denom * that.numer , denom + that.denom)
}


object Main {
  def main(args: Array[String]) {
    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)
    val sum = oneHalf add twoThirds

    println("oneHalf [" + oneHalf + "]")
    println("twoThirds [" + twoThirds + "]")
    println("sum [" + sum + "]")
    println("sum.numer [" + sum.numer + "]")
    println("sum.denom [" + sum.denom + "]")
  }
}
