package com.bigdata.scala.learn.chapter07

class Breakless1 {
  var i = 0
  var foundIt = false

  def main(args: Array[String]): Unit = {
    while (i < args.length && !foundIt) {
      if (!args(i).startsWith("-")) {
        if (args(i).endsWith(".scala"))
          foundIt = true
      }
      i = i + 1
    }

    println("foundIt = " + foundIt)
    println("i = " + i)
  }
}
