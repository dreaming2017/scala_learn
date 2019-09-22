package com.bigdata.scala.learn.chapter04

/**
  * 不需要写main方法了！
  */
object FallWinterSpringSummer extends App {
  for (season <- List("fall", "winter", "spring","fall"))
    println(season + ": " + ChecksumAccumulator.calculate(season))
}
