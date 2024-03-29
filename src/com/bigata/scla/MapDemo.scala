package com.bigata.scla

import scala.collection.mutable

object MapDemo {
  def main(args: Array[String]): Unit = {

    val treasureMap = mutable.Map[Int, String]()
    println(treasureMap)
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap(2))

    println(treasureMap)

    val romanNumeral = Map(
      1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
    )
    println(romanNumeral(4))
  }
}
