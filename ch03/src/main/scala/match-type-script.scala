object MatchingOnType {
  def main(args: Array[String]) = {
    val sundries = List(23, "Hello", 8.5, 'q')
    for (sundry <- sundries) {
      sundry match {
        case i: Int => println("got an Integer: " + 1)
        case s: String => println("got a String: " + s)
        case f: Double => println("got a Double: " + f)
        case other => println("got something else: " + other)
      }
    }
  }
}