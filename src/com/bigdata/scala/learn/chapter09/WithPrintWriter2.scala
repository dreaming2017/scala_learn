package com.bigdata.scala.learn.chapter09

import java.io.{File, PrintWriter}

object WithPrintWriter2 {
  def withPrintWriter(file: File)(op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  def main(args: Array[String]): Unit = {
    val file = new File("./date.txt")

    withPrintWriter(file) { writer =>
      writer.println(new java.util.Date)
    }
  }
}
