package com.onewingsoft.module01.fundamentals

/**
  * Created by natete on 09/04/17.
  */
object Project {

  def main(args: Array[String]): Unit = {
    val examples = Examples()

    examples.stringManipulations()
    println()

    examples.listAndMap()
    println()

    examples.traverse()
    println()

    examples.conAndLoop()
    println()
  }
}
