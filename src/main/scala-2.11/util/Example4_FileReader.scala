package util

import java.io._

import scala.io.Source

object Example4_FileReader{
  def main(args: Array[String]): Unit = {
    val in = new BufferedReader(
      new FileReader(new File("E:\\AIMIA\\workspace\\scala-examples\\src\\main\\resources\\Mid_Cap_Stocks.csv")))
    var currLine:String = in.readLine()
    while(currLine != null) {
      println(currLine)
      currLine = in.readLine()
    }
  }
}

