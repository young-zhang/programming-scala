object StringUtil3 {
  def joiner(strings: List[String], separator: String): String =
    strings.mkString(separator)

  def joiner(strings: List[String]): String = strings.mkString(" ")

  def toCollection(string: String) = string.split(' ')
}

object StringUtilClient {
  import StringUtil3._

  def main(args: Array[String]) = {
    args foreach { s => toCollection(s).foreach { x => println(x) } }
  }
}