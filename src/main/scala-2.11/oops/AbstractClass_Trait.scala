package oops

object AbstractClass_Trait {
  def main(args: Array[String]): Unit = {
    val obj_sum = new Sum(10,30)
    println(obj_sum.Add())
  }
}
// Abstract class example
abstract class Calculation{
  def Add():Any
}

class Sum(m:Int,n:Int)extends Calculation {
  override def Add(): Any = m+n
}


trait ABC{
  def sub():Int
}

