package com.onewingsoft.module01.fundamentals

import scala.collection.mutable.ArrayBuffer

/**
  * Created by natete on 09/04/17.
  */
object Fundamentals {

  def main(args: Array[String]): Unit = println("hello world!")

  // language fundamentals
  var x = 10
  println(x)
  x = 11
  println(x)
  x = x + 1
  println(x)
  x += 1
  println(x)

  val y = 10
  //y = 11 -> error val is immutable

  val z: Double = 10
  println(z)
  val greeting: String = null
  val greeting1: Any = "hello"
  println(greeting)
  println(greeting1)

  val xmax, ymax = 100
  val a0 = 1
  val b0 = 3
  val c0 = 2.4
  println(xmax, ymax)
  println(a0, b0, c0)

  val (a, b, c) = (5, "Hello", 3.14)
  println(a, b, c)
  println(c)

  // String declarations
  val s1 = "String"
  println(s1)
  val s2: String = "My " + s1
  println(s2)
  val s3: String = s1 + " " + 100
  println(s3)
  val s4: String = 100.toString
  println(s4)
  val s5: String =
    """first line
      |second line""".stripMargin
  println(s5)
  println("".isEmpty)
  println("abc".getBytes)
  println("abc".charAt(1))
  println("abc".length)

  // Strings are Sea (scala list abstraction)
  println("Hello".intersect("world"))
  //  println("Hello" intersect "world")
  println("aabbbccc".distinct)
  //  println("aabbbccc" distinct)
  println("abcde".head)
  //  println("abcde" head)
  println("abcde".size)
  println("abcde".length) // better
  println("abcde".reverse)
  println("aBcDe".filter(x => x.isUpper))
  println("aBcDe".filter(x => x.isLower))

  // Variable length arrays
  val b2: ArrayBuffer[Int] = ArrayBuffer[Int]()
  b2 += 1
  println(b2)
  b2 += (1, 2, 3, 5)
  println(b2)
  b2 ++= Array(8, 13, 21)
  println(b2)
  b2.trimEnd(5)
  println(b2)
  b2.insert(1, 6)
  println(b2)
  b2.insert(2, 7, 8, 9)
  println(b2)
  b2.remove(2)
  println(b2)
  b2.remove(2, 3)
  println(b2)
  val c2: Array[Int] = b2.toArray
  println(c2.toBuffer)

  // multi-dimensional arrays
  val matrix: Array[Array[Double]] = Array.ofDim[Double](3, 4) // 3 rows, 4 columns
  println(matrix(2)(3))
  matrix(2)(3) = 42
  println(matrix(2)(3))

  // Java to Scala collection conversions
  import scala.collection.JavaConversions._

  val arrayList = new java.util.ArrayList[String]()
  arrayList.add("abc")
  println(arrayList)
  println(arrayList.toArray())
  println(arrayList.toBuffer)

  val map = new java.util.HashMap[String, Int]()
  map.put("a", 10)
  println(map)
  println(map.toMap)

  // collections
  val l1 = List(1, 2, 3)
  println(l1)
  val l2 = List()
  println(l1 == Nil) // false
  println(l2 == Nil) // true
  val l3 = List(1, "a")
  println(l3)
  println(l3(0))
  val l4 = List(1, -2, 3, 2, -1, 0, 3)
  println(l4.sorted)
  println(l4.sorted.reverse)
  println(List("b", "a").sorted)
  //  println(List(1, "a").sorted) error because inferred type is Any and you cannot sort Any
  println(List(1, "a").sortWith((x, y) => x + "" < y + ""))

  // mutable list
  import scala.collection.mutable.ListBuffer

  val lb: ListBuffer[String] = ListBuffer.empty[String]
  lb += "a"
  println(lb)
  lb += ("c", "d", "e")
  println(lb)
  lb += "d"
  println(lb)
  lb -= "d" // removes the first occurrence of the param
  println(lb)
  lb ++= List("f", "g")
  println(lb)


  println(List(1, 1, 2, 2))
  println(Set(1, 1, 2, 2))
  println(List(1, 2, 3, 4) ++ List(3, 4, 5, 6))
  println(Set(1, 2, 3, 4) ++ Set(3, 4, 5, 6))
  println(Set(1, 2, 3) == Set(3, 1, 2))
  println(List(1, 2, 3) == List(3, 1, 2))
  println(Set(1, 2, 3) + 2)
  println(Set(1, 2, 3, 4, 5).toList)
  println(Set(1, 2, 3, 4, 5).toList sorted)
  println(Set(1, 2, 3, 4, 5).toList)
  println(Set(5, 4, 3, 2, 1).toList)

  // immutable Map
  val scores0 = Map("John" -> 75, "Julia" -> 60, "Kevin" -> 26) // Map[String, Int]
  println(scores0)
  val scores1 = Map(("John", 75), ("Julia", 60), ("Kevin", 26))
  println(scores1)
  println(scores0("Julia"))
  println(if (scores0.contains("Julia")) scores0("Julia") else 0)
  println(if (scores0.contains("julia")) scores0("julia") else 0)
  println(scores0.getOrElse("Julia", 0))
  println(scores0.getOrElse("julia", 0))
  println(scores0.get("Julia")) // Some(60)
  println(scores0.get("Jacob")) // None
  println(scores0.get("Julia").getOrElse(0)) // 60
  println(scores0.get("Jacob").getOrElse(0)) // 0

  // mutable maps
  import scala.collection.mutable.{Map => MMap}

  val scores2 = MMap("John" -> 75, "Julia" -> 60, "Kevin" -> 26)
  println(scores2("Julia"))
  //  println(scores("Jacob")) // NoSuchElementExciption
  scores2 += ("Jacob" -> 78, "Julia" -> 65)
  println(scores2)
  scores2 -= "Jacob"
  println(scores2)
  val scores3: MMap[String, Int] = scores2 + ("Julia" -> 55, "Jacob" -> 77)
  println(scores3)
  val scores4: MMap[String, Int] = scores3 - "Jacob"
  println(scores4)

  // Element traversing
  println("scores 2: ", scores2)
  for ((k, v) <- scores2) println((k, v))
  for ((k, v) <- scores2) println(k + " -> " + v)
  println(scores2.keySet)
  for (v <- scores2.values) println("value: " + v)
  for ((k, v) <- scores2) yield println((v, k))

  // Streams are Lists with lazy access to elements
  val st: Stream[Int] = (1 to 100).toStream
  println(st)
  println(st.filter(_ % 10 == 0))
  println(st.filter(_ % 10 == 0).toList)

  // Tuples
  val t: (Int, Double, String) = (1, 3.14, "John")
  println(t)
  println(t._1)
  println(t._2)
  println(t._3)
  println("t._3: ", t._3)
  val (first, second, third) = t
  println("first: ", first, "second: ", second, "third: ", third)
  val (first1, second1, _) = t

  // Zipping
  val symbols = Array("<", "-", ">")
  val counts = Array(2, 10, 2)
  val pairs: Array[(String, Int)] = symbols zip counts
  for ((s, n) <- pairs) print(s * n)
  println()

  // Two Lists to Map transformation
  val keys = List(1, 2, 3)
  val values = List("a", "b", "c")
  val newMap: Map[Int, String] = (keys zip values).toMap
  println(newMap)
  println(newMap(1))

  // List manipulation
  // From abstraction collections to lists
  val t2 = Traversable(1, 2, 3)
  println(t2)
  val i = Iterable(1, 2, 3)
  println(i)
  val sq = Seq(1, 2, 3)
  println(sq)

  // Operations with Lists
  val odds = List(1, 3, 5, 7, 9)
  val evens = List(2, 4, 6, 8)
  val nums: List[Int] = odds ++ evens
  println(nums)
  val digs: List[Int] = 0 :: nums
  println(digs)
  val lstr: List[String] = "a" :: "b" :: "c" :: Nil
  println(lstr)

  // Other useful examples
  val list = List(1, -2, 3, 2, -1, 0, -3)
  println(list.head)
  println(list.tail)
  println(list.last)
  println(list.take(4))
  println(list.takeRight(4))
  println(list.slice(3, 6))
  println(list.sum)
  println(list.min)
  println(list.max)
  println(list.contains(3))
  println(list.indexOf(3))
  println(list.mkString("|"))
  println(list.count(x => x * x > 1))

  println(List(1, 2, 3) intersect List(2, 3, 4))
  println(List(1, 2, 3) diff List(2, 3, 4))
  println(List(1, 2, 3).permutations.toList)
  println(List(1, 2, 3).combinations(2).toList)
  println(List(List(1, 2), List(3, 4)).flatten)

  // Conditionals
  val x3 = 0
  val y2: Int = if (x3 > 0) 1 else -1
  println(y2)
  println(if (x3 > 0) "plus" else -1)
  println(if (x3 > 0) 1 else ())
  println(if (x3 > 0) 1)

  // Loops
  var sum = 0
  while (sum < 10) sum += 1
  println(sum)
  sum = 0
  var k = 0
  while (k < 10) {
    sum += k * k
    k += 1
  }
  println(sum, k)

  var sum1 = 0
  val l = List(1, 2, 3, 4, 5)
  for (e <- l) sum1 += e
  println(sum1)

  sum1 = 0
  for (i <- 1 to 10) sum1 += i
  println(sum1)

  sum1 = 0
  for (ch <- "Hello") sum1 += ch
  println(sum1)

  for (i <- 1 to 3; j <- 1 to 3) print((10 * i + j) + " ")
  println()

  for (i <- 1 to 3; j <- 1 to 3 if i != j) print((10 * i + j) + " ")
  println()

  for (i <- 1 to 3; from = 4 - 1; j <- from to 3) print((10 * i + j) + " ")
  println()
}