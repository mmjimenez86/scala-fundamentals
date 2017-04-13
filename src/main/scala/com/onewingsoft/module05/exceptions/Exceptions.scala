package com.onewingsoft.module05.exceptions

import java.io.{FileNotFoundException, FileReader, IOException}

/**
  * Created by natete on 13/04/17.
  */
class Exceptions {

  def demoException(): Unit = {
    try {
      val file = new FileReader("input.txt")
      file.close()
    } catch {
      case _: FileNotFoundException => println("Missing file exception")
      case _: IOException => println("IO Exception")
    }
  }
}
