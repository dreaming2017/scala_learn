package com.bigdata.scala.learn.chapter07

object Match {
  def match1(args: Array[String]): Unit = {
    val firstArg = if (args.length > 0) args(0) else ""

    //有副作用的match
    firstArg match {
      case "salt" => println("pepper")
      case "chips" => println("salsa")
      case "eggs" => println("bacon")
      case _ => println("huh?")
    }
  }

  def match2(args: Array[String]) {
    val firstArg = if (!args.isEmpty) args(0) else ""

    //无副作用的match
    val friend =
      firstArg match {
        case "salt" => "pepper"
        case "chips" => "salsa"
        case "eggs" => "bacon"
        case _ => "huh?"
      }

    println(friend)
  }

  def main(args: Array[String]): Unit = {
    Match.match1(Array())
    Match.match1(Array("foo"))
    Match.match1(Array("eggs"))


    Match.match2(Array("chips"))
  }
}
