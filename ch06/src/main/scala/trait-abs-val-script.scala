object TraitAbsVal {
  def main(args: Array[String]): Unit = {

    trait AbstractT1 {
      val name: String  // abstract
    }

    class Base

    class ClassWithAbstractT1 extends Base with AbstractT1 {
      val name = "ClassWithAbstractT1"
    }

    val c = new ClassWithAbstractT1()
    println(c.name)

    class ClassExtendsAbstractT1 extends AbstractT1 {
      val name = "ClassExtendsAbstractT1"
    }

    val c2 = new ClassExtendsAbstractT1()
    println(c2.name)

  }
}