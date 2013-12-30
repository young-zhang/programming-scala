object SimpleMatch {
  def main(args: Array[String]) = {
    //val bools : List[Boolean] = List(true, false)
    val bools : List[Any] = List(true, false, "")
    for (bool <- bools) {
      bool match {
        case true => println("true")
        case false => println("false")
        case _ => println("something else") // doesn't work in Scala 2.10 - unreachable code - for List[Boolean]
      }
    }
  }
}