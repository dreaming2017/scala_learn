package com.bigdata.scala.learn.chapter06.ex9

/**
  * 定义操作符
  *
  * @param n
  * @param d
  */
class Rational(n: Int, d: Int) {
  require(d != 0)

  //私有字段
  private val g = gcd(n.abs, d.abs)

  val numer: Int = n / g
  val denom: Int = d / g

  override def toString = numer + "/" + denom


  def add(that: Rational): Rational = new Rational(numer * that.denom + denom * that.numer, denom + that.denom)

  def lessThan(that: Rational) = this.numer * that.denom < that.numer * this.denom

  //这里的this是自引用
  def max(that: Rational) = if (lessThan(that)) that else this

  //辅助构造方法
  def this(n: Int) = this(n, 1);

  //求最大公约数
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def +(that: Rational): Rational = new Rational(numer * that.denom + denom * that.numer, denom * that.denom)

  def *(that: Rational): Rational = new Rational(numer * that.numer, denom * that.denom)
}


object Main {
  def main(args: Array[String]) {
    val x = new Rational(1, 2)
    val y = new Rational(2, 3)
    println("x [" + x + "]")
    println("y [" + y + "]")
    println("x + y [" + (x + y) + "]")
    println("x.+(y) [" + (x.+(y)) + "]")
    println("x + x * y [" + (x + x * y) + "]")
    println("(x + x) * y [" + ((x + x) * y) + "]")
    println("x + (x * y) [" + (x + (x * y)) + "]")
  }
}