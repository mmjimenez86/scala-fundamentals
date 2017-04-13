package com.onewingsoft.module04.classes

/**
  * Created by natete on 13/04/17.
  */
class Cat(val race: String, name: String = "Miaouuuw") extends Pet(name) {
  override def animalRace: String = "Cat"
}
