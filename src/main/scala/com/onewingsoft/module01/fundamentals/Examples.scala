package com.onewingsoft.module01.fundamentals

/**
  * Created by natete on 09/04/17.
  */
case class Examples() {
  def stringManipulations() {
    println("inside basic function stringManipulations")
    val str1 = "hello. "
    val str2 = "how are u"
    val str = str1.concat(str2)
    println("Concatenated String is: " + str)
  }

  def listAndMap() {
    println("inside basic function listAndMap")
    val x = List(1, 2, 3)
    println("values in list x = " + x)
    val y = 0 :: x
    println("values in list when prepended = " + y)
    val xx = List(5, 6, 7, 8)
    println("values in list xx = " + xx)
    val c = x ::: xx // val c = x ++ xx
    println("values in list c append x and  xx = " + c)
    println()

    println("start map")
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
    println(colors)
    println("Keys in colors : " + colors.keys) // println("Keys in colors : " + colors.keySet)
    println("Values in colors : " + colors.values)
    println("Check if colors is empty : " + colors.isEmpty)
    val nums = Map[Int, Int]()
    println("Check if nums is empty : " + nums.isEmpty)
  }

  def traverse() {
    println("start traverse")
    val movies = Map(
      "Lady in the Water" -> 3.0,
      "Snakes on a Plane" -> 4.0,
      "You, Me and Dupree" -> 3.5
    )

    //    for ((k, v) <- movies) println(s"key: $k, value: $v")
    movies.foreach {
      case (movie, rating) => println(s"key: $movie, value: $rating")
    }
  }

  def conAndLoop() {
    println("start conditional loops")
    val list = (1 to 10).toList
    println("list = " + list)
    for (a <- list if a != 3 && a < 8) println(s"Value of a: $a")
    //list.filter(x => x != 3 && x < 8).foreach(a => println(s"Value of a: $a"))
  }
}
