package com.onewingsoft.module05.project

import java.io.FileNotFoundException

import scala.io.Source

/**
  * Created by natete on 13/04/17.
  * The challenge consists in reading a file split it, put it in a map and count the number of words
  */
class Challenge {

  def countWords(fileName: String): Int = {
    try {
      val lines = Source.fromFile(fileName).getLines().toList

      var numWords = 0

      lines.foreach(line => numWords += line.split("\\s+").length)
      numWords

    } catch {
      case _: FileNotFoundException => throw new Exception("The requested file doesn't exist")
    }
  }

  def teachersCountWords(fileName: String): Int = {
    val source = Source.fromFile(fileName).mkString
    val map = source.split("\\s+").groupBy(x => x).mapValues(x => x.length)
    println(map)
    map.values.sum
  }
}
