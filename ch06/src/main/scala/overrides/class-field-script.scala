package overrides

object ClassFieldScript {
  def main(args: Array[String]): Unit = {
    class C1 {
      val name = "C1"
      var count = 0
    }
    class ClassWithC1 extends C1 {
      override val name = "ClassWithC1"
      count = 1
    }
    val c = new ClassWithC1()
    println(c.name)
    println(c.count)
  }
}