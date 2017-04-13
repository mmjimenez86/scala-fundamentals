package com.onewingsoft.module05.project

/**
  * Created by natete on 13/04/17.
  */
object main {

  def main(args: Array[String]): Unit = {
    val challenge = new Challenge
    val numWords = challenge.countWords("demo.txt")
    println(s"The file has $numWords words")

    val teachersNumWords = challenge.teachersCountWords("demo.txt")
    println(s"The file has $teachersNumWords words")
  }
}
