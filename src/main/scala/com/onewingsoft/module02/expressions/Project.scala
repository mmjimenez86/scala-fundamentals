package com.onewingsoft.module02.expressions

/**
  * Created by natete on 12/04/17.
  */
object Project {
  def main(args: Array[String]): Unit = {

    exercise1()

    println("----------")

    exercise2()
  }

  /**
    * Exercise 1
    * Command line application output. It should accept -v or --version and then show the app version
    * -h or --help and then show the usage instructions
    * show an error message and the usage instructions otherwise.
    */
  private def exercise1() = {

    val cmdArgument = ""

    val output: String = usageFunction(cmdArgument)

    println(output)
  }

  private def usageFunction(cmdArgument: String): String = {
    val usageInstructions =
      """Usage instructions:
        |  Use -v or --version to know the version of your Command
        |  -h or --help for help
      """.stripMargin

    cmdArgument match {
      case "--version" | "-v" => "2.3.4"
      case "--help" | "-h" => usageInstructions
      case _ => s"You entered a wrong argument: Please follow the usage instruction\n\n$usageInstructions"
    }
  }

  /**
    * Exercise 2
    * print numbers from 1 to 10 and then
    * from 1 to 10, print every number divisible by two.
    */
  private def exercise2() = {
    for (i <- 1 to 10) println(i)
    println("----------")
    for (i <- 1 to 10 if i % 2 == 0) println(i)
  }
}
