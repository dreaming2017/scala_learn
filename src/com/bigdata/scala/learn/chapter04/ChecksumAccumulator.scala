package com.bigdata.scala.learn.chapter04

import com.bigdata.scala.learn.chapter04.Ex2.ChecksumAccumulator

import scala.collection.mutable

/**
  * 演示单列对象
  */
object ChecksumAccumulator {
  //缓存之前计算过的校验和
  private val cache = mutable.Map.empty[String, Int]

  /**
    * 计算String的所有字符的校验和
    * @param s
    * @return
    */
  def calculate(s: String): Int =
    if (cache.contains(s))
      //返回映射的值
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
  }

  def main(args: Array[String]): Unit = {
   val checksum1 =  ChecksumAccumulator.calculate("Every value is an object.")
    println("checksum1 = " + checksum1)
    println(calculate("aaaaa"))
    println(calculate("aaaaa"))
    println(calculate("bbbb"))
    println(calculate("bbbbb"))
  }
}
