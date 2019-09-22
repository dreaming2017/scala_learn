package com.bigdata.scala.learn.chapter06.ex6

class Rational(n: Int, d: Int) {
  require(d != 0)

  override def toString = n + "/" + d

  val numer: Int = n
  val denom: Int = d

  def add(that: Rational): Rational = new Rational(numer * that.denom + denom * that.numer , denom + that.denom)

  def lessThan(that: Rational) = this.numer * that.denom < that.numer * this.denom

  //这里的this是自引用
  def max(that: Rational) = if(lessThan(that)) that else this


}


object Main {
  def main(args: Array[String]) {
    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)

    println("oneHalf [" + oneHalf + "]")
    println("twoThirds [" + twoThirds + "]")

    println("oneHalf.lessThan(twoThirds) [" + oneHalf.lessThan(twoThirds) + "]")
    println("oneHalf.max(twoThirds) [" + oneHalf.max(twoThirds) + "]")
  }
}
