object MatchingOnTuplesAndGuards {
  def main(args: Array[String]) = {
    val tupleA = ("Good", "Morning!")
    val tupleB = ("Guten", "Tag!")
    for (tup <- List(tupleA, tupleB)) {
      tup match {
        case (s1, s2) if s1 == "Good" =>
          println("A two-tuple starting with 'Good'.")
        case (s1, s2) =>
          println("This has two things: " + s1 + " and " + s2)
      }
    }
  }
}