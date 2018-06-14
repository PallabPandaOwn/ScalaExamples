package unit.test

object Calculator {
  def main(args: Array[String]): Unit = {

  }

  def add(num:Int*):Int = {
    var sum = 0
    for(n <- num)
      sum += n
    return sum
  }
}