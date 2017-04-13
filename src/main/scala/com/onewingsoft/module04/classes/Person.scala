package com.onewingsoft.module04.classes

/**
  * Created by natete on 12/04/17.
  */
case class Person(firstName: String, lastName: String) {

  val myFirstName: String = firstName
  val myLastName: String = lastName
  var age: Int = 0

  def getFullName: String = s"$lastName, $firstName"

  def getFullInfo: String = s"My name is $firstName $lastName, and I am $age years old"

  def this(firstName: String, lastName: String, age: Int) {
    this(firstName, lastName)
    this.age = age
  }

  val getOnlyFirstName: String = {
    println("initializing this... I'm not lazy at all!")
    firstName
  }

  lazy val getOnlyFirstNameLazily: String = {
    println("This message will never print unless it's called explicitly")
    firstName
  }
}
