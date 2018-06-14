package collections

/**
  * Created by sidhartha.ray on 14-11-2017.
  */
object Example5_Map {
  def main(args: Array[String]): Unit = {
    var stocks1 = Map(("REL", 900.0), ("ASHOK LEYLAND", 113.5))
    var stocks2 = Map("YES BANK" -> 303.5, "SBIN" -> 200.0)
    var noStocks: Map[String, Double] = Map.empty[String, Double]
    var allStocks = stocks1 ++ stocks2 ++ noStocks
    println("Stocks1: " + stocks1)
    println("Stocks2: " + stocks2)
    println("No stocks: " + noStocks)
    println("All stocks: " + allStocks)
    var allStocksAdded = allStocks + ("ONGC" -> 183.0)
    println("All stocks with added element: " + allStocksAdded)
    var allStocksRemoved = allStocks - ("YES BANK")
    println("All stocks with 1 removed element: " + allStocksRemoved)

  }
}
