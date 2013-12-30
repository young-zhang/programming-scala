object UsingTryCatchAndFinally {
  def main(args: Array[String]): Unit = {
    import java.util.Calendar

    val then = null
    val now = Calendar.getInstance()

    try {
      now.compareTo(then)
      //1/0
    } catch {
      case e: NullPointerException =>
        println("One was null!")
        //System.exit(-1)
      case unknown: Throwable =>
        println("Unknown exception " + unknown)
        //System.exit(-1)
    } finally {
      println("It all worked out.")
      System.exit(0)
    }
  }
}