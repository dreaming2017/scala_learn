package com.bigata.scla
import scala.collection.mutable
object SetDemo {
  def main(args: Array[String]): Unit = {

    //这里虽然使用了var，但是默认Set是不可变的，最好写成val
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    //返回false
    println(jetSet.contains("Cessna"))

   val movieSet =  mutable.Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    println(movieSet)
  }
}
