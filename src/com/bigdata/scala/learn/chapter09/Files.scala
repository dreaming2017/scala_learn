package com.bigdata.scala.learn.chapter09

object Files {
  def filesHere = (new java.io.File(".")).listFiles

  private def filesMatching(matcher: String => Boolean) =
    for (file <- filesHere; if matcher(file.getName))
      yield file

  //(fileName:String,query:String => fileName.endWith(query))
  def filesEnding(query: String) = filesMatching(_.endsWith(query))


  def filesContaining(query: String) =
    filesMatching( _.contains(query))

  def filesRegex(query: String) =
    filesMatching(_.matches(query))

  def main(args: Array[String]): Unit = {
    println("filesEnding(\"scala\").toList [" +
      filesEnding("scala").toList + "]")
    println("filesContaining(\"Files\").toList [" +
      filesContaining("Files").toList + "]")
    println("filesRegex(\".*Re.ex.*\").toList [" +
      filesRegex(".*Re.ex.*").toList + "]")
  }
}
