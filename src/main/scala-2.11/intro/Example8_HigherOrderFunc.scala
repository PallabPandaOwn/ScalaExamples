package intro

/**
  * Created by sidhartha.ray on 04-11-2017.
  */
object Example8_HigherOrderFunc {
  def main(args: Array[String]): Unit = {
    // Example 1
    functionEx(25, multiplyBy2)                  // Passing a function as parameter

    // Example 2
    var result1 = (a:Int, b:Int) => (a + b)        // Anonymous function by using => (rocket)
    var result2 = (_:Int) + (_:Int)              // Anonymous function by using _ (underscore) wild card
    println(result1(10, 10))
    println(result2(10, 10))

    // Example 3
    var sum = add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)      // Variable length argument
    println("Sum of 1 to 9 = " + sum)

    // Example 4
    var result = multiplyBy5(add5(10))          // Function composition
    println(result)

  }

  def functionEx(a:Int, f:Int => AnyVal): Unit = {
    println("Value = " + f(a))                  // Calling that function
  }

  def multiplyBy2(a:Int): Int = {
    a * 2
  }

  def add(args: Int*):Int = {
    var sum = 0;
    for(num <- args)
      sum = sum + num
    return sum
  }

  def add5(a:Int): Int = {
    a + 5
  }

  def multiplyBy5(a:Int): Int = {
    a * 5
  }

}
