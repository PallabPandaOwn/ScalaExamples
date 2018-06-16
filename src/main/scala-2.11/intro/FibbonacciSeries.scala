package intro

object FibbonacciSeries {
  def main(args: Array[String]): Unit = {

    def fibo(a:Int,b:Int):Stream[Int] = a#::fibo(b,a+b)
    val f = fibo(1,2)
    f.takeWhile(_ <10) foreach(println)
  }
}
