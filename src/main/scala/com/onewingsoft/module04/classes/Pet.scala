package com.onewingsoft.module04.classes

/**
  * Created by natete on 13/04/17.
  */
abstract class Pet(val name: String) {
  override def toString: String = s"The pet of the family, they call me: $name"

  def animalRace: String
}
