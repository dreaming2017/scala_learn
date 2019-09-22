package com.bigdata.scala.learn.chapter06.ex10

/**
  * 方法重载
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

  def +(i: Int): Rational = new Rational(numer + i * denom, denom)


  def -(that: Rational): Rational =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )

  def -(i: Int): Rational =
    new Rational(numer - i * denom, denom)

  def *(that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  def *(i: Int): Rational =
    new Rational(numer * i, denom)

  def /(that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)

  def /(i: Int): Rational =
    new Rational(numer, denom * i)
}

object Main {
  def main(args: Array[String]) {
    val x = new Rational(2, 3)
    println("x [" + x + "]")
    println("x * x [" + (x * x) + "]")
    println("x * 2 [" +
      "" + (x * 2) + "]")

    //隐式转换
    implicit def intToRational(x: Int) = new Rational(x)

    val r = new Rational(2, 3)
    println("2 * r [" + (2 * r) + "]")
  }
}


