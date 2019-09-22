package com.bigdata.scala.learn.chapter06.ex7

class Rational(n: Int, d: Int) {
  require(d != 0)

  val numer: Int = n
  val denom: Int = d

  override def toString = numer + "/" + denom

  def add(that: Rational): Rational = new Rational(numer * that.denom + denom * that.numer , denom + that.denom)

  def lessThan(that: Rational) = this.numer * that.denom < that.numer * this.denom

  //这里的this是自引用
  def max(that: Rational) = if(lessThan(that)) that else this

  //辅助构造方法
  def this(n :Int ) = this(n,1);


}

object Main {
  def main(args: Array[String]) {
    val y = new Rational(3)
    println("y [" + y + "]")
  }
}
