// code-examples/XML/reading/for-loop-script.scala

object ForLoop extends App {
  val someXML =
    <sammich>
      <bread>wheat</bread>
      <meat>salami</meat>
      <condiments>
        <condiment expired="true">mayo</condiment>
        <condiment expired="false">mustard</condiment>
      </condiments>
    </sammich>

  for (condiment <- (someXML \\ "condiment")) {
    if ((condiment \ "@expired").text == "true")
      println("the " + condiment.text + " has expired!")
  }
}