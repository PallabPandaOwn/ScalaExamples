package collections

object Example2_Set {
  def main(args: Array[String]): Unit = {
    var games = Set("Cricket", "Football", "Golf")
    println("Set games: " + games)

    // Set properties
    println("Head: " + games.head)
    println("Tail: " + games.tail)
    println("Is the set empty? " + games.isEmpty)

    // Merging 2 sets
    var moreGames = Set("Racing", "Golf")
    var allGames = games ++ moreGames
    println("# of elements in games set: " + games.size)
    println("# of elements in moreGames set: " + moreGames.size)
    println("# of elements in allGames: " + allGames.size)
    println("Set allGames: " + allGames)

    // Adding and removing elements in Set
    allGames += "Hocky"
    println("Adding 'Hocky' to allGames: " + allGames)
    allGames += "Cricket"
    println("Adding 'Cricket' to allGames: " + allGames)
    allGames -= "Golf"
    println("Removing 'Golf' from allGames: " + allGames)

    // Set operations
    var commonGames = games.intersect(moreGames)
    println("Set intersection: " + commonGames)
    var allGames2 = games.union(moreGames)
    println("Set union: " + allGames2)
    var onlyGames = games.diff(moreGames)
    println("Set difference: " + onlyGames)
  }
}