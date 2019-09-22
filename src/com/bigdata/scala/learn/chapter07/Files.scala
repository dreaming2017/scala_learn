package com.bigdata.scala.learn.chapter07

object Files {
  val filesHere = (new java.io.File(".")).listFiles()

  /**
    * 用for表达式列举目录中的文件清单
    */
  def printFiles() {
    for (file <- filesHere)
      println(file)
  }

  /**
    * 在scala中不常用
    */
  def printFilesIter() {
    for (i <- 0 to filesHere.length - 1)
      println(filesHere(i))
  }

  def printScalaFiles(): Unit = {
    for (file <- filesHere if (file.getName.endsWith(".scala")))
      println(file)
  }

  def printScalaFiles2() {
    for (file <- filesHere)
      if (file.getName.endsWith(".scala"))
        println(file)
  }

  def printScalaFiles3() {
    for (
      file <- filesHere
      if file.isFile
      if file.getName.endsWith(".scala")
    ) println(file)
  }

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toList

  /**
    * 在for表达式中使用多个生成器
    * @param pattern
    */
  def grepParens(pattern: String) {
    def grep(pattern: String) =
      for (
        file <- filesHere
        if file.getName.endsWith(".scala");
        line <- fileLines(file)
        if line.trim.matches(pattern)
      ) println(file + ": " + line.trim)

    //这里才能调用执行
    grep(pattern)
  }

  def grepGcd() {
    def grep(pattern: String) = grepParens(pattern)
    grep(".*gcd.*")
  }


  /**
    * 在for表达式中使用中途赋值
    */
  def grepGcd2() {
    def grep(pattern: String) =
      for {
        file <- filesHere
        if file.getName.endsWith(".scala")
        line <- fileLines(file)
        trimmed = line.trim
        if trimmed.matches(pattern)
      } println(file + ": " + trimmed)

    grep(".*gcd.*")
  }

  /**
    * 产生一个新的集合:
    * 格式 for 子句 yield 代码体
    * @return
    */
  def scalaFiles =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
    } yield file

  val forLineLengths =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*for.*")
    } yield trimmed.length

  def main(args: Array[String]): Unit = {
    Files.printFiles()
    println("----------------------------------")
    Files.printFilesIter()
    println("----------------------------------")
    Files.printScalaFiles()
    println("----------------------------------")
    Files.printScalaFiles2()
    println("----------------------------------")
    Files.printScalaFiles3()

    println("----------------------------------")
    Files.grepParens(".*asdf.*")
    println("----------------------------------")
    Files.grepGcd()
    println("----------------------------------")
    Files.grepGcd2()

    println("----------------------------------")
    println("Files.scalaFiles.toList [" + Files.scalaFiles.toList + "]")
    println("Files.forLineLengths.toList [" + Files.forLineLengths.toList + "]")
  }
}
