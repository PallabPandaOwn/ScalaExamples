package oops

object FunctionReturn {
  def main(args: Array[String]): Unit = {
     //Returning a Function to variable Example
    def AA(x:Int):Object=(i:Int)=>{
      if(x>1)
        {i*i}
      else
        {i*i+100}
    }
    val f=AA(0)
    println(f)

    def greeting(language: String):Object = (name: String) => {
      language match {
        case "english" => "Hello, " + name
        case "spanish" => "Buenos dias, " + name
      }
    }

    def big_func(x: Int): Object = () => {
      val small_func = () => "Hello, " + x
      return small_func()

    }


    println("Parameterise constru")
    //val obj = new ABC(100,200)

  }
}

// default constructor Example

//class ABC(x:Int,y:Int){
//  def ShowNumber()={println {
//    "First Parameter =" + x + "\t Second Parameter" + y
//  }
////    this{} // default
//  }
//}

