package com.bigdata.scala.learn.chapter09

import java.io.{File, PrintWriter}

object WithPrintWriter1 {
  def withPrintWriter(file: File, op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  def main(args: Array[String]) {
    withPrintWriter(
      new File("./transcript.txt"),
      writer => writer.println(new java.util.Date)
    )
  }
}
