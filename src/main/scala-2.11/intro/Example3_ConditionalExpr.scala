package intro

/**
  * Created by sidhartha.ray on 04-11-2017.
  */
object Example3_ConditionalExpr {
  def main(args: Array[String]): Unit = {
    // Conditional expression
    val age = 23
    if (age < 18) {
      println("child")
    } else if(age >= 18 && age < 65) {
      println("adult")
    } else {
      println("old")
    }
  }
}
