package collections

import scala.collection.immutable.HashSet


object Test_Collection {
  def main(args: Array[String]): Unit = {
    val s = HashSet("A", "B")
    println(s.hashCode())
    //s = s ++ mutable.HashSet("C", "D")
    //println(s.hashCode())
    println(s.hashCode())
    println(s)
  }
}