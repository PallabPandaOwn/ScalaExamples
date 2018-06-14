package oops

/**
  * Created by sidhartha.ray on 05-11-2017.
  */
object Example2_Contr {
  var name:String = "ABC"
  def main(args: Array[String]): Unit = {
    //Example 1
    val emp1 = new Employee(101, "Sidhartha")   // Passing values to constructor
    emp1.show()                                 // Calling a function by using an object
    val emp2 = new Employee(102, "Sachin")
    emp2.show()

    //Example 2
    var lty = new LoyaltyProgram(101, "Super Saver", 20);
    lty.show()

    var x = Example2_Contr
    var y = Example2_Contr
    println(x.name)
    println(y.name)
  }
}

//Example 1
class Employee(id:Int, name:String){            // Primary constructor
  def show(){
    println("Student: ID: " + id + ", Name: " + name)
  }
}

//Example 2
class LoyaltyProgram(id:Int, point:Int) {
  var name:String = null

  def this(id:Int, name:String, point:Int){
    this(id, point)
    this.name = name
  }

  def show(){
    println("Loyalty Program[" + id + ", " + name + ", " + point + "]")
  }
}

