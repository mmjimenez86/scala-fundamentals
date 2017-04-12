package com.onewingsoft.module03.functions

/**
  * Created by natete on 12/04/17.
  */
object Project {

  def main(args: Array[String]): Unit = {

    def finalCountDown: (Int) => Unit = (count: Int) => {
      println(count)
      println("count--")
      println("function sleep for 1s")
      Thread.sleep(1000)
      if (count > 0) finalCountDown(count - 1)
    }

    println(s"count is set as 10")
    finalCountDown(10)

    println("Teachers implementation")
    println("-----------------")
    println("Count is set as 10")
    var count = 10
    println("Function is called using an anonymous function")

    oncePerSecond(() => {
      println(count)
      println("count--")
      count -= 1
      count > 0
    })

    def oncePerSecond(callback: () => Boolean): Unit = {
      while (callback()) {
        Thread sleep 1000
        println("Function sleep for 1s")
      }
    }
  }
}
