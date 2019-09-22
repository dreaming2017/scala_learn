package com.bigata.scla

object Ext3 {
  def main(args: Array[String]) {
    val greetStrings = new Array[String](3)

    greetStrings.update(0, "Hello")
    greetStrings.update(1, ", ")
    greetStrings.update(2, "world!\n")

    for (i <- 0.to(2))
      print(greetStrings.apply(i))

    println("---------------------------------------------")

    val numNames = Array("zero", "one", "two")
    println("numNames =" + numNames)
    println("numNames.toList = " + numNames.toList)

    val numNames2 = Array.apply("zero", "one", "two")
    println("numNames2.toList =" + numNames2.toList)

    println("---------------------------------------------")

    val oneTwoThree = List("one", "tow", "three")
    println("oneTwoThree =" + oneTwoThree)
    val oneTwoThree2 = List.apply("one", "tow", "three")
    println("oneTwoThree2=" + oneTwoThree2)

    /**
      *
      */
    {
      val oneTwo = List(1, 2)
      val threeFour = List(3, 4)
      val oneTwoThreeFour = oneTwo ::: threeFour
      println(oneTwo + " and " + threeFour + " were not mutated.")
      println("Thus, " + oneTwoThreeFour + " is a new list.")
    }

    {
      val twoThree = List(2, 3)
      val oneTwoThree = 1 :: twoThree
      println("twoThree = " + twoThree)
      println("oneTwoThree = " + oneTwoThree)
    }
  }
}
