package collections

/**
  * Created by sidhartha.ray on 14-11-2017.
  */
object Example6_Tuple {
  def main(args: Array[String]): Unit = {
    var t = ("REL", 900.5)
    t.productIterator.foreach{ i => print(i + " ")}
    println()
    println(t._1, t._2)

    var x = ("HDFC", ("Bangalore", 100000, 10000000))
  }
}
