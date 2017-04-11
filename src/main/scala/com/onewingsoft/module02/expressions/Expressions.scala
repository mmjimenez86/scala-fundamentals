package com.onewingsoft.module02.expressions

/**
  * Created by natete on 10/04/17.
  */
object Expressions {

  def main(args: Array[String]): Unit = {

    // Statement, it returns nothing
    val myValue = 10
    println("Hello World!")

    val lines = scala.io.Source.fromFile("file.txt").mkString
    println(lines)

    // Expressions
    val myVal = 5 // right side is an expression
    val calculus = {val PI = 3.14; PI * myVal}
    println(s"Calculus = $calculus")

    val number: Int = 2
    val divideByTwo = if (number % 2 == 0) {println("Divisible by two!")} else None
    println(divideByTwo)

    val result: Int = 3 * 2 * {if (number % 2 == 0) {number * 2} else {0}}
    println(s"Result = $result")

    // Match Expressions
    val laptop = "Mac"
    val laptopType = laptop match {
      case "Mac" => "hello apple!"
      case "PC" => "hello PC!"
      case _ => "Are you sure you're a laptop"
    }

    println(laptopType)

    val productType = "iPod"
    val productTypeMatch = productType match {
      case "Mac" | "iPod" | "iPad" => "Hello Apple!"
      case "PC" | "Surface" | "WindowsPhone" => "Hello Microsoft!"
      case _ => "Sorry, I don't know what you're talking about..."
    }
    println(s"product type = $productTypeMatch")

    // Pattern Guards
    val productType2 = "Linux"
    val productTypeMatch2 = productType2 match {
      case "Mac" | "iPod" | "iPad" => "Hello Apple!"
      case "PC" | "Surface" | "WindowsPhone" => "Hello Microsoft!"
      case nothingMatches if nothingMatches == "Linux" => "Great choice!"
      case _ => "Sorry, I don't know what you're talking about..."
    }
    println(s"product type2 = $productTypeMatch2")

    // Match all
    val matchAll = "Blaah"
    val matchEmAll = matchAll match {
      case "Mac" => "hello apple!"
      case "PC" => "hello PC!"
      case nothingMatches => s"What do you mean by $nothingMatches"
    }
    println(s"Match All = $matchEmAll")

    // wildcards
    val wildcard = "Blaah"
    val wildcardVal = wildcard match {
      case "Mac" => "hello apple!"
      case "PC" => "hello PC!"
      case _ => s"I don't think that your product is a PC or Apple, it's a $wildcard"
    }
    println(s"Wildcard = $wildcardVal")

    // Down casting - pattern variables
    val typedVariable: Any = 2.3
    val typeOfVariable = typedVariable match {
      case _: Int => "Integer, I can do my calculations"
      case _: String => "String, I cannot do my calculations but I can use the value for text."
      case _: Double => "Double, let's go! I can do my calculations"
      case _ => "Any"
    }
    println(s"The type of my variable: $typeOfVariable")

    // Closures
    val y = 2
    val addYVariable = (x: Int) => x + y
    println("Adding an outsid variable to my function: " + addYVariable(3))
    var extras = 10
    val fullPrice = (price: Int) => price + extras
    println("Full price with extras = " + fullPrice(40))
    extras = 20
    println("Full price with extras = " + fullPrice(40))
  }
}
