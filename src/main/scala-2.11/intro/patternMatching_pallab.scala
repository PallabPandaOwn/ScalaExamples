package intro

object patternMatching_pallab {
  def main(args: Array[String]): Unit = {


    def Match_Lines(x:Any)={
      x match {
        case i:Int =>"This is an Integer"
        case s:String=>"This is an String"
        case _:Any=>"Did not match"
      }
    }
println(Match_Lines(1))

  }
}
