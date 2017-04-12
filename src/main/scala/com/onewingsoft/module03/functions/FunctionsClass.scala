package com.onewingsoft.module03.functions

/**
  * Created by natete on 12/04/17.
  */
class FunctionsClass {
  private var count = 0

  def printTime() {

    println("Inside basic function printTime")
    println("Getting time in nanoseconds")
    println("Time in nanoseconds is " + System.nanoTime)
  }

  def time(): Long = {
    println("Inside basic function time")
    println("Getting time in nanoseconds")
    System.nanoTime
  }

  def delayed(t: => Long): Unit = {
    println("Entering into de delayed method")
    println(s"Param $t")
    println("Exited from function")
  }

  def printStrings(args: String*): Unit = {
    println("Entering into the function printStrings")
    var i: Int = 0
    println("Iterating in for each loop")
    for (arg <- args) {
      println(s"arg value[$i] = $arg")
      i += 1
    }
  }

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    println("Entering into the function addInt")
    sum = a + b

    sum
  }

  def printInt(a: Int, b: Int): Unit = {
    println(s"Value of a: $a")
    println(s"Value of b: $b")
    println("Exiting printInt")
  }
}
