package com.bigdata.scala.learn.chapter09

object Files2 {
  def filesHere = (new java.io.File(".")).listFiles


  def filesMatching(query: String, matcher: (String, String) => Boolean) = {
    for (file <- filesHere; if matcher(file.getName, query))
      yield file
  }

  //(fileName:String,query:String => fileName.endWith(query))
  def filesEnding(query: String) = filesMatching(query, _.endsWith(_))

  def filesContaining(query: String) =
    filesMatching(query, _.contains(_))

  def filesRegex(query: String) =
    filesMatching(query, _.matches(_))

  def main(args: Array[String]): Unit = {
    println("filesEnding(\"scala\").toList [" +
      filesEnding("scala").toList + "]")
    println("filesContaining(\"Files\").toList [" +
      filesContaining("Files").toList + "]")
    println("filesRegex(\".*Re.ex.*\").toList [" +
      filesRegex(".*Re.ex.*").toList + "]")
  }
}
