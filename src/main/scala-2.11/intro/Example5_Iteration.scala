package intro

/**
  * Created by sidhartha.ray on 04-11-2017.
  */
object Example5_Iteration {
  def main(args: Array[String]): Unit = {
    // while loop
    var a = 10        // Initialization
    while(a <= 20){   // Condition
      println(a)
      a = a + 2       // Incrementation
    }
//while(rs.hasNext){
//var emp = rs.next()
//}
    // do-while loop
    var b = 10;       // Initialization
    do {
      println(b);
      b = b + 2;      // Increment
    }
    while(b <= 20)    // Condition

    // for loop
    for(c <- 1 to 10){
      println(c);
    }
  }
}
