package com.onewingsoft.module03.functions

/**
  * Created by natete on 12/04/17.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val inc = (x: Int) => x + 1
    val x = inc(7)
    println(s"Anonymous function called $x")

    val mul = (x: Int, y: Int) => x * y
    println(mul(3, 4))

    val functionsClass = new FunctionsClass
    functionsClass.printTime()

    val timeCapture = functionsClass.time()
    println("----")
    println(timeCapture)

    println("This is only the function call")
    println(functionsClass.time())

    functionsClass.delayed(functionsClass.time())
    println("\n\n\n")

    functionsClass.printStrings("Hello", "Scala", "Python")

    println("Returned value = " + functionsClass.addInt(3, 2))

    functionsClass.printInt(b = 5, a = 7)
  }
}
