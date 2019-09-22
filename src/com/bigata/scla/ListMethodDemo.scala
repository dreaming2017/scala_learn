package com.bigata.scla

/**
  * List的方法掩饰
  */
object ListMethodDemo {
  def main(args: Array[String]): Unit = {

    //创建空列表
    val list1 = List()
    println("list1 = " + list1)

    val list2 = ()
    println("list2 = " + list2)

    println("-----------------------------")

    val list3 = List("Cool","tools","rule")
    println("list3 = " + list3)

    val thrill = "Will" :: "fill" :: "until" :: Nil
    println("thrill = " + thrill)
    //3
    println("thrill.size = " + thrill.size)
    println("thrill(2) =" + thrill(2))

    //对thrill中长途为4的字符串元素进行计数
    val count = thrill.count(s => s.length == 4)
    println("thrill4 =" + count)

    //返回去掉了thrill的头两个元素的列表,返回thrillDrop =List(until)
    val thrillDrop = thrill.drop(2)
    println("thrillDrop =" + thrillDrop)

    val thrillDropRight = thrill.dropRight(2)
    println("thrillDropRight =" + thrillDropRight)

    //判断thrill中是否有字符串元素的值为until
    val existsTest = thrill.exists( s => s =="until")
    println("existsTest =" + existsTest)

    //thrillFilter =List(Will, fill)
    val thrillFilter = thrill.filter(s => s.length ==4)
    println("thrillFilter =" + thrillFilter)

    val allEndWith = thrill.forall(s => s.endsWith("l"))
    println("allEndWith =" + allEndWith)

    println("----------------foreach println start -------------")
    thrill.foreach(println)
    println("----------------foreach println end -------------")

   val head =  thrill.head
    println("head =" + head)

    //返回列表除了最后一个一个元素之外的其他元素组成打的列表，相反方法是tail
    val init = thrill.init
    println("init =" + init)

    //thrillMap =List(Willy, filly, untily)
    val thrillMap = thrill.map(s => s +  "y")
    println("thrillMap =" + thrillMap)

   // thrillString =Will,fill,until
    val thrillString = thrill.mkString(",")
    println("thrillString =" + thrillString)
  }
}
