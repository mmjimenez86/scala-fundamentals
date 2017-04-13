package com.onewingsoft.module04.classes

/**
  * Created by natete on 12/04/17.
  */
class Student(override val firstName: String,
              override val lastName: String,
              mark: Double) extends Person(firstName, lastName) {

  def studentInfo: String = s"Hi, I am $firstName $lastName I am a good student, here is my mark: $mark"
}
