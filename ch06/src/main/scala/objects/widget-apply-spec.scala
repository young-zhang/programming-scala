package objects

object WidgetApplySpec {

  def main(args: Array[String]): Unit = {
    Widget("(button: label=click me, (Widget))") match {
      case Some(w) => w match {
        case b:Button =>
          assert(b.label == "click me", "b.label mustEqual \"click me\"")
        case x =>
          assert(false, x.toString())
      }
      case None => assert(false, "None returned.")
    }
    Widget("(textfield: text=This is text, (Widget))") match {
      case Some(w) => w match {
        case tf:TextField =>
          assert(tf.text == "This is text", "tf.text mustEqual \"This is text\"")
        case x =>
          assert(false, x.toString())
      }
      case None => assert(false, "None returned.")
    }
  }

}