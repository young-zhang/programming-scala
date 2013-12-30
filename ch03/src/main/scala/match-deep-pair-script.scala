object BindingNestedVariablesInCaseClauses {
  def main(args: Array[String]) = {

    class Role
    case object Manager extends Role
    case object Developer extends Role
    case class Person(name: String, age: Int, role: Role)

    val alice = new Person("Alice", 25, Developer)
    val bob = new Person("Bob", 32, Manager)
    val charlie = new Person("Charlie", 32, Developer)

    for (item <- Map(1 -> alice, 2 -> bob, 3 -> charlie)) {
      item match {
        case (id, p @ Person(_, _, Manager)) => println("id=%d: %s is overpaid.".format(id, p))
        case (id, p @ Person(_, _, _)) => println("id=%d: %s is underpaid.".format(id, p))
      }
    }

  }
}