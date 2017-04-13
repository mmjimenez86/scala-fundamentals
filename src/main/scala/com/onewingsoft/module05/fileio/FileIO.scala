package com.onewingsoft.module05.fileio

import java.io._

import scala.io.Source

/**
  * Created by natete on 13/04/17.
  */
class FileIO {

  def fileWriter(): Unit = {
    val writer = new PrintWriter(new File("demo.txt"))
    writer.println("Hello Scala")
    writer.write("2nd line")
    writer.close()
  }

  def fileReader(): Unit = {
    val fileName = "demo.txt"
    val lines = Source.fromFile(fileName).getLines().toList
    println(lines.length)
    for (line <- lines) println(line)

  }
}
