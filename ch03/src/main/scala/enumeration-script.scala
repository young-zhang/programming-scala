object Enumerations {
  def main(args: Array[String]) = {

    object Breed extends Enumeration {
      val doberman = Value("Doberman Pinscher")
      val yorkie = Value("Yorkshire Terrier")
      val scottie = Value("Scottish Terrier")
      val dane = Value("Great Dane")
      val portie = Value("Portuguese Water Dog")
    }
    // print a list of breeds and their IDs
    println("ID\tBreed")

    for (breed <- Breed.values) {
      println(breed.id + "\t" + breed)
    }

    // print a list of Terrier breeds
    println("\nJust Terriers:")
    Breed.values.filter(_.toString.endsWith("Terrier")).foreach(println)

    object WeekDay extends Enumeration {
      type WeekDay = Value
      val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value
    }
    import WeekDay._

    def isWorkingDay(d: WeekDay) = ! (d == Sat || d == Sun)

    println("")
    println("Working days:")
    WeekDay.values filter isWorkingDay foreach println

  }
}