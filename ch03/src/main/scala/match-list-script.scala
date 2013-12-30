object MatchingOnList {
  def main(args: Array[String]) = {
    val willWork = List(1, 3, 23, 90)
    val willNotWork = List(4, 19, 52)
    val empty = List()

    def processList(l: List[Any]): Unit = {
      l match {
        case head :: tail =>
          print("%s ".format(head))
          processList(tail)
        case Nil => println("")
      }
    }

    println("--------------------------------------")
    for (l <- List(willWork, willNotWork, empty)) {
      print("List: ")
      processList(l)
    }
    println("--------------------------------------")
  }
}