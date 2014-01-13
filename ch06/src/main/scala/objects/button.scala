// code-examples/AdvOOP/objects/button.scala

package objects

import ui3.Clickable

class Button(val label: String) extends Widget with Clickable {

  def click() = {
    // Logic to give the appearance of clicking a button...
  }

  def draw() = {
    // Logic to draw the button on the display, web page, etc.
  }

  override def toString() = "(button: label=" + label + ", " + super.toString() + ")"
}

object Button {
  // takes a single Button arg and returns a Some wrapping the label value
  def unapply(button: Button) : Some[String] = Some(button.label)
}