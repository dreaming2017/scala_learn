package com.bigdata.scala.learn

import com.bigdata.scala.learn.chapter04.ChecksumAccumulator

object Summer {
  def main(args: Array[String]) = {
    for (arg <- args)
      println(arg + ": " + ChecksumAccumulator.calculate(arg))
  }
}
