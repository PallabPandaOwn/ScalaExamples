package collection

object Example1_Array {
  def main(args: Array[String]): Unit = {
    // Example 1
    val arr = new Array[Int](5)
    println(arr)
    for(a <- arr)
      print(a + " >> ")
    println()
    arr(2) = 10
    arr.foreach((element:Int) => print(element + " >> "))
    println()

    // Example 2 - Passing Array as an argument and returning an Array from a function
    val arr2 = add2(arr)
    arr2.foreach((element:Int) => print(element + " >> "))
    println()

    // Example 3 - Multi-dimensional array
    val arr3 = Array.ofDim[Int](2, 2)
    arr3(1)(0) = 15
    show(arr3, 2, 2)

    // Example 4 - Multi-dimensional array using Array of Array
    val arr4 = Array(Array(1,2,3,4,5), Array(6,7,8,9,10))
    println("Printing a 2D array:")
    show(arr4, 2, 5)

    // Example 5 - addition of matrices
    var mat1 = Array(Array(1,2,3,4,5), Array(6,7,8,9,10))   // Creating multidimensional array
    var mat2 = Array(Array(1,2,3,4,5), Array(6,7,8,9,10))
    var resMat = add(mat1, mat2)
    println("Matrix Addition:")
    show(resMat, 2, 5)
  }

  // Add 2 to each elements of an array
  def add2(arr:Array[Int]): Array[Int] = {
    for(i <- 0 to arr.length - 1)
      arr(i) += 2
    return arr
  }

  // Print a 2D array
  def show(arr:Array[Array[Int]], rows:Int, cols:Int){
    for(i <- 0 until  rows){
      for(j <- 0 until cols){
        print(" " + arr(i)(j))
      }
      println()
    }
  }

  // Matrix addition
  def add(mat1:Array[Array[Int]], mat2:Array[Array[Int]]): Array[Array[Int]] = {
    var res = Array.ofDim[Int](2, 5)
    for(i <- 0 to 1){
      for(j <- 0 to 4){
        res(i)(j) = mat1(i)(j) + mat2(i)(j)
      }
    }
    return res
  }
}