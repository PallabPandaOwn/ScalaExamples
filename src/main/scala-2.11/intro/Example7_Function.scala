package intro

/**
  * Created by sidhartha.ray on 04-11-2017.
  */
object Example7_Function {
  def main(args: Array[String]): Unit = {
    val logs = List(
      "2017-10-13 10:00:00|RIL|830.00",
      "2017-10-13 10:00:10|MARUTI SUZUKI|8910.00",
      "2017-10-13 10:00:20|RIL|835.00",
      "2017-10-13 10:00:30|MARUTI SUZUKI|8890.00"
    )

//    var x = List(1, "S", true)
//    for(i <- x) {
//      println(i)
//    }
   /* for(x <- logs) {
      val logArray = parse(x)
      println("Timestamp: " + logArray(0) + "\\t Company: " + logArray(1) + "\\t Price: " + logArray(2))
    }*/
    val result= logs.map(x => x.split("\\|"))
    for(res <- result){
    println("Timestamp: " + res(0) + "\\t Company: " + res(1) + "\\t Price: " + res(2))}
  }

  def parse(line: String): Array[String] = {
    return line.split("\\|")
  }

//  def print(content: String) {
//    println(content)
//  }
}
