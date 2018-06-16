package intro

object RecursionFactorial {
  def main(args: Array[String]): Unit = {
    def factorials(n:Int):Int={
      if(n<=0)
        return 1
      else
        return n*factorials(n-1)
    }

    println(factorials(5))

  }
}
