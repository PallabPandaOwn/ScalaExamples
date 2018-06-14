package intro

import scala.util.control.Breaks._                  // Importing  package

/**
  * Created by sidhartha.ray on 04-11-2017.
  */
object Example6_Break {
  def main(args: Array[String]): Unit = {
    breakable {                                     // Breakable method to avoid exception
      for(i <- 1 to 10 by 2){
        if(i == 7)
          break                                     // Break used here
        else
          println(i)
      }
    }
  }
}
