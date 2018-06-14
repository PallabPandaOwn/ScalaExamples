import java.util.Calendar

class Account {
  var acNum: Int = 0
  var bal: Double = 0.0
  var acOpeningDate: Calendar = null

  def getBalance(): Double = {
    return bal
  }
}

object Test {
  def main(args: Array[String]): Unit = {
    var hdfcBranch = HDFC.branch
    var hdfcBranch2 = HDFC.branch
    println(hdfcBranch + " - " + hdfcBranch2)
  }
}

object HDFC {

  class Branch(branchName:String)

  var branch:List[Branch] = null

  def createBranch(name:String): Branch = {
    return new Branch("Marathahalli")
  }
}
