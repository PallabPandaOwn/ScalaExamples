package oops

/**
  * Created by sidhartha.ray on 05-11-2017.
  */
class Student{
  var id=10                          // All fields must be initialized
  var name="Pallab Panda"
}

object Example1_Class{
  def main(args:Array[String]){
    var student = new Student()               // Creating an object
    println(student.id + " " + student.name)
    student.id = 101                          // Resetting the object members
    student.name = "Sidhartha"
    println(student.id + " " + student.name)
  }
}