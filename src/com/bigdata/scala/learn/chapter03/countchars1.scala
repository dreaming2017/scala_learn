package com.bigdata.scala.learn.chapter03

import scala.io.Source

/**
  * 从文件中读取文本行
  */
object countchars1 {
  def main(args: Array[String]){

    if(args.length >0){
      for(line <- Source.fromFile(args(0)).getLines())
                                                                                                                       println(line.length + " " + line)
    }else
      Console.err.println("Please enter filename")
  }
}
