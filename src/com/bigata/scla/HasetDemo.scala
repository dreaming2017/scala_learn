package com.bigata.scla

import scala.collection.immutable.HashSet


object HasetDemo {
  def main(args: Array[String]): Unit = {
    val hashSet = HashSet("Tomatoes", "Chilies")

    //+ 是不可变集上的,会生成一个新的集合
    println(hashSet +"Coriander")
    println(hashSet)


  }
}
