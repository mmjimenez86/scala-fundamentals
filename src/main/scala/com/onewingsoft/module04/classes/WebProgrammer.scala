package com.onewingsoft.module04.classes

/**
  * Created by natete on 13/04/17.
  */
class WebProgrammer(override val company: String = "Emergya",
                    val webNavigatorName: String = "Chrome") extends Engineer(company) {
  override def preferredLanguage: String = "Javascript"

}
