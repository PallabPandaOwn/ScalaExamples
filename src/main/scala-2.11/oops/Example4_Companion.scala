package oops

/**
  * Created by sidhartha.ray on 05-11-2017.
  */
class department (id:Int, name:String) {
  var noOfEmp:Int = 10
  var minSalary:Double = 500000.0
  var maxSalary:Double = 5000000.0

  def show(): Unit = {
    println("Department[" + id + ", " + name + "]")
  }
}

object department {
  def instanciate(id:Int, name:String, minSalary:Double = 500000.0, maxSalary:Double = 5000000): department = {
    var dept = new department(id, name)
    dept.minSalary = minSalary
    dept.maxSalary = maxSalary
    return new department(101, "Data Science")
  }
}

object Example4_Companion {
  def main(args: Array[String]): Unit = {
    var dep = department.instanciate(101, "Data Science")
    dep.show()
    println("Min salary = " + dep.minSalary)
    println("Max salary = " + dep.maxSalary)
  }
}
