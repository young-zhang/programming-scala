object StringUtil {
  def joiner(strings: List[String], separator: String): String =
    strings.mkString(separator)

  def joiner(strings: List[String]): String = joiner(strings, " ")

  def main(args: Array[String]) = {
    //println(joiner(List("Programming", "Scala")))
    println(List("Programming", "Scala").mkString("_", " ", "!"))
  }
}