object VariableInMatches {
  def main(args: Array[String]) = {
    import scala.util.Random
    val randomInt = new Random().nextInt(10)
    randomInt match {
      case 7 => println("lucky seven")
      case otherNumber => println("some other number: " + otherNumber)
    }
  }
}