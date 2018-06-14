package collections

/**
  * Created by sidhartha.ray on 14-11-2017.
  */
object Example4_Seq {
  def main(args: Array[String]): Unit = {
    // Seq Example
    var seq:Seq[Int] = Seq(52, 85, 1, 8, 3, 2, 7)

    // Commonly used functions
    println("Seq example >>>>>>>>>>>>")
    seq.foreach((element: Int) => print(element + " "))
    println()
    println("2nd element: " + seq(1))
    println("Is Empty? " + seq.isEmpty)
    println("Ends with (2, 7)? "+ seq.endsWith(Seq(2,7)))
    println("Contains 8? " + seq.contains(8))
    println("Last index of 3: " + seq.lastIndexOf(3))
    println("Reverse order of sequence: " + seq.reverse)

    // Vector Example
    println("Vector example >>>>>>>>>>>>>")
    var games = Vector("Hocky", "Cricket", "Golf")
    var moreGame = Vector("Swimming")
    print("Games: ")
    games.foreach((element: String) => print(element + " "))
    games = games :+ "Racing"                              // Adding a new element into vector
    print("\nGames after adding 'Racing': ")
    games.foreach((element: String) => print(element + " "))
    var allGames = games ++ moreGame                          // Merging two vector
    print("\nAll games after merging: ")
    allGames.foreach((element: String) => print(element + " "))
    var reverse = allGames.reverse                               // Reversing vector elements
    print("\nAll games after reversing: ")
    reverse.foreach((element: String) => print(element + " "))
    var sortedGames = allGames.sorted                            // Sorting vector elements
    print("\nAll games after sorting: ")
    sortedGames.foreach((element: String) => print(element + " "))
    println()

    // List Example
    println("List example >>>>>>>>>>>>>")
    var list1 = List(1, 8, 5, 6, 9, 58, 23, 15, 4)
    var list2 = List(88, 100)
    print("List1 elements: ")
    list1.foreach((element: Int) => print(element + " "))       // Iterating using foreach loop
    print("\nElement at index 2: " + list1(2))                  // Accessing element of 2 index
    var list3 = list1 ++ list2                                  // Merging two list
    print("\nElement after merging List1 and List2: ")
    list3.foreach((element:Int) => print(element + " "))
    var list4 = list3.sorted                                    // Sorting list
    print("\nElement after sorting List3: ")
    list4.foreach((element: Int) => print(element + " "))
    var list5 = list3.reverse                           // Reversing list elements
    print("\nElements in reverse order of List3: ")
    list5.foreach((element: Int) => print(element + " "))
    println()
  }
}
