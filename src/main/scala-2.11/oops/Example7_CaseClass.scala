package  oops

object Example7_CaseClass {

  def main(args: Array[String]): Unit = {
    // Example 1
    var ins =  Insurance(50000, 10)                 // Creating object of case class
    println("Premium amount = " + ins.premium + " and Maturity period = " + ins.maturityPeriod)
                                                   // Accessing elements of case class

    // Example 2
    callCase(JeevanAnmol(100000, 10))
    callCase(JeevanSathi(100000))
    callCase(MoneyBack)
  }

  def callCase(f:LifeInsurance) = {
    f match{
    case JeevanAnmol(premium, maturityPeriod) => println("Premium amount = " + premium + " and Maturity period = " + maturityPeriod)
    case JeevanSathi(premium) => println("Premium amount = " + premium)
    case MoneyBack => println("Dummy Policy")
  }
  }
}

// Example 1
case class Insurance(premium:Double, maturityPeriod:Int)

// Example 2
trait LifeInsurance

case class JeevanAnmol(premium:Double, maturityPeriod:Int) extends LifeInsurance    // Case class

case class JeevanSathi(premium:Double) extends LifeInsurance                        // Case class

case object MoneyBack extends LifeInsurance                                         // Case object
