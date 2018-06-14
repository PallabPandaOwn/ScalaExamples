package intro

/**
  * Hello World Example
  */
object Example1_HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World")
    Example_2 // object calling
  }
}
object Example_2 {
  println("Welcome to Spark")
}
