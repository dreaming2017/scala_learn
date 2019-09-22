package com.bigdata.scala.learn.chapter03

import scala.io.Source

object Ex5 {
  def main(args: Array[String]){

    def countchars3(args: Array[String]): Unit = {
      //计算每行数字的拥有的字符长度的最大长度 ，比如某行有字符100个，计算出就是3
      def widthOfLength(s: String) = s.length.toString.length

      if (args.length > 0) {
        //注意：这里要使用toList
        val lines = Source.fromFile(args(0)).getLines().toList

        val longestLine = lines.reduceLeft(
          (a, b) => if (a.length > b.length) a else b
        )
        val maxWidth = widthOfLength(longestLine)

        for (line <- lines){
          val numSpaces = maxWidth - widthOfLength(line)
          val padding = " " * numSpaces
          println(padding + line.length + " | " + line)
        }

        println("maxWidth [" + (maxWidth) + "]")
      }
    }
    countchars3(Array("countchars1.scala"));
  }
}
