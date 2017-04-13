package com.onewingsoft.module04.classes

/**
  * Created by natete on 12/04/17.
  */
object main {

  def main(args: Array[String]): Unit = {
    val person = Person("John", "Doe")
    println(s"The first name is ${person.firstName}")
    println(s"The last name is ${person.lastName}")
    println(s"The full name is ${person.getFullName}")
    println(s"The full info is ${person.getFullInfo}")

    val person2 = new Person("Jane", "Doe", 30)
    println(s"The first name is ${person2.firstName}")
    println(s"The last name is ${person2.lastName}")
    println(s"The full name is ${person2.getFullName}")
    println(s"The full info is ${person2.getFullInfo}")


    println(s"get first name non-lazy ${person2.getOnlyFirstName}")
    println(s"get first name lazy ${person2.getOnlyFirstNameLazily}")
    println(s"get first name lazy ${person2.getOnlyFirstNameLazily}")

    val student = new Student("James", "Wilson", 17)
    println(s"Student info ${student.studentInfo}")

    val cat = new Cat("plain")
    println(s"This cat is type: ${cat.race}, Here is the name: ${cat.toString}")

    // Polymorphism
    val listWithDifferentTypes = "String" :: 2 :: 3 :: 10 :: "AnotherString" :: Nil
    println("##Begin List##")
    listWithDifferentTypes.foreach(println)
    println("##End List##")

    val typedList: List[String] = "String1" :: "String2" :: "String3" :: Nil
    typedList.foreach(println)

    // Functions
    def getHead[A](list: List[A]) = list.head

    println(getHead(List[Int](2, 3)))

    /**
      * Challenge
      * Write a class called Engineer which has a non-defined method: "programmerPreferredLanguage" and a lazy value "codeEditor"
      * The Engineer class has only one field: the engineers working company with a default value
      * Then a class called WebProgrammer which inherits from the Engineer class and has one other value: webNavigatorName
      */

    val webProgrammer = new WebProgrammer("Emergya", "Chrome")
    println(s"${webProgrammer.webNavigatorName} ${webProgrammer.company} ${webProgrammer.codeEditor} ${webProgrammer.preferredLanguage}")
  }
}
