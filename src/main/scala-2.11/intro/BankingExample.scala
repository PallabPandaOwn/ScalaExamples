package intro

object BankingExample  {
  def main(args: Array[String]): Unit = {
    var A1 = new Account(123,"TestAccount",10000)
    //Account.count = Account.count +1
//    A1.Account_number=12345678
//    A1.Name="TestAccount"
//    A1.Balance=2000000
    A1.deposit(1000)
    A1.Withdraw(5000)
    println("Total balance on Account ="+ A1.getBalance)

    var A2 = new Account(124,"TestAccount2",20000)
    //Account.count = Account.count +1
    //    A1.Account_number=12345678
    //    A1.Name="TestAccount"
    //    A1.Balance=2000000
    A2.deposit(1000)
    A2.Withdraw(5000)
    println("Total balance on Account ="+ A2.getBalance)


    println("Number of Account = "+ Account.count)
  }
}

object Account{
  var count:Int=0
 def IncrementCounter: Unit ={
   count = count+1
 }
}
//Account Class
class Account(var Account_number:Long,var Name:String,var Balance:Long) {
//  var Account_number:Long=0
//  var Name:String= null
//  var Balance:Long=0
  {
    Account.IncrementCounter
  }
def getBalance: Long ={
  return  Balance
}
  //Add balance
  def deposit(Amount:Long):Unit = {
    //Balance= Balance+Amount
    Balance+=Amount
  }

  //Withdraw Balance
  def Withdraw(Amount:Long):Unit ={
    //Balance= Balance-Amount
    Balance-=Amount
  }
}
