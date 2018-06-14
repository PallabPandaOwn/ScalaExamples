package util

import java.io.Serializable

@SerialVersionUID(123L)
class Stock(var symbol: String, var price: Double) extends Serializable {
  override def toString = "Stock[" + symbol + ", " + price +"]"
}