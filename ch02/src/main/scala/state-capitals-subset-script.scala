// code-examples/TypeLessDoMore/state-capitals-subset-script.scala

object StateCapitals {
  val stateCapitals = Map(
    "Alabama" -> "Montgomery",
    "Alaska" -> "Juneau",
    // ...
    "Wyoming" -> "Cheyenne")

  def main(args: Array[String]) = {
    println("Get the capitals wrapped in Options:")
    println("Alabama: " + stateCapitals.get("Alabama"))
    println("Wyoming: " + stateCapitals.get("Wyoming"))
    println("Unknown: " + stateCapitals.get("Unknown"))
    println("Get the capitals themselves out of the Options:")
    println("Alabama: " + stateCapitals.get("Alabama").get)
    println("Wyoming: " + stateCapitals.get("Wyoming").getOrElse("Oops!"))
    println("Unknown: " + stateCapitals.get("Unknown").getOrElse("Oops2!"))
  }
}