package com.bigdata.scala.learn

/**
  * for循环
  */
object ForDemo {
  def main(args: Array[String]): Unit = {

    //for(i <- 表达式),表达式1 to 10返回一个Range（区间）[1,10]
    //每次循环将区间中的一个值赋给i
    for (i <- 1 to 10)
      println("i =" + i)

    println("------------------------------")

    //for(i <- 数组)
    val arr = Array("a", "b", "c")
    for (i <- arr)
      println(i)
    println("------------------------------")

    /** *
      * 类似java中
      * for(i=1;i++;i<=3
      * for(j=1;i++;j<=3
      */
    //高级for循环
    //每个生成器都可以带一个条件，注意：if前面没有分号
    for (i <- 1 to 3; j <- 1 to 3 if i != j)
      print((10 * i + j) + " ")
    println()

    //for推导式：如果for循环的循环体以yield开始，则该循环会构建出一个集合
    //每次迭代生成集合中的一个值
    val w = for (i <- 1 to 10) yield i * 10

    println("w =" + w)
  }
}
