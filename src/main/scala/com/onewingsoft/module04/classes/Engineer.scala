package com.onewingsoft.module04.classes

/**
  * Created by natete on 13/04/17.
  */
abstract class Engineer(val company: String = "INEM") {

  def preferredLanguage: String

  lazy val codeEditor: String = "IntelliJ Idea"

}
