package com.onewingsoft.module05.fileio

/**
  * Created by natete on 13/04/17.
  */
object main {
  def main(args: Array[String]): Unit = {
    val fileIO = new FileIO

    fileIO.fileWriter()

    fileIO.fileReader()
  }
}
