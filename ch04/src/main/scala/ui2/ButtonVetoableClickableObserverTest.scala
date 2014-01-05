package ui2

import ui.ButtonCountObserver

object ButtonVetoableClickableObserverTest {
  def main(args: Array[String]): Unit = {
    val observableButton = new Button("Okay") with VetoableClicks with ObservableClicks
    val buttonClickCountObserver = new ButtonCountObserver
    observableButton.addObserver(buttonClickCountObserver)

    for (i <- 1 to 3) observableButton.click()

    if (buttonClickCountObserver.count == 3)
      println("Everything works! buttonClickCountObserver.count is 3!")
    else
      println("buttonClickCountObserver.count is " + buttonClickCountObserver.count)
  }
}
