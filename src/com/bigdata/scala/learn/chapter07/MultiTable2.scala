package com.bigdata.scala.learn.chapter07

class MultiTable2 {
  // 以序列形式返回一行
  def makeRowSeq(row: Int) =
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }

  // 以字符串形式返回一行
  def makeRow(row: Int) = makeRowSeq(row).mkString


  def multiTable() = {

    val tableSeq = // a sequence of row strings
      for (row <- 1 to 10)
        yield makeRow(row)

    tableSeq.mkString("\n")
  }
}

object MultiTable2Test{
  def main(args: Array[String]): Unit = {
   val mt = new MultiTable2
    println(mt.multiTable())

  }
}
