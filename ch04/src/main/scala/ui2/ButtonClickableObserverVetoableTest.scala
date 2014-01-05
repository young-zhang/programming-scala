package ui2

import ui.ButtonCountObserver

object ButtonClickableObserverVetoableTest {
  def main(args: Array[String]): Unit = {
    val observableButton = new Button("Okay") with ObservableClicks with VetoableClicks
    val buttonClickCountObserver = new ButtonCountObserver
    observableButton.addObserver(buttonClickCountObserver)

    for (i <- 1 to 3) observableButton.click()

    if (buttonClickCountObserver.count == 1)
      println("Everything works! buttonClickCountObserver.count is 1!")
    else
      println("buttonClickCountObserver.count is " + buttonClickCountObserver.count)
  }
}
