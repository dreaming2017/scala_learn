package com.bigata.scla

object Utils {
  def main(args: Array[String]): Unit = {
    printArgs(Array("zero", "one", "two"))
  }
  def printArgs(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }


  {
    def printArgs(args: Array[String]): Unit = {
      for (arg <- args)
        println(arg)
    }
    printArgs(Array("three", "four", "five"))
  }

  {
    def printArgs(args: Array[String]): Unit = {
      args.foreach(println)
    }
    printArgs(Array("six", "seven", "eight"))
  }
}
