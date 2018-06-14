package oops

/**
  * Created by sidhartha.ray on 05-11-2017.
  */
object Example3_Singleton {
  def main(args: Array[String]): Unit = {
    Institute.show()
  }
}

object Institute {
  val name:String = "Data Science Monks"
  val location:String = "Bangalore"
  val instructor:String = "Sidhartha Ray"

  def show(): Unit = {
    println("Institute[" + name + ", " + location + ", " + instructor + "]")
  }
}