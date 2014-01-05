package ui2

import ui.ButtonCountObserver

object ButtonClickableObserverTest {
  def main(args: Array[String]): Unit = {

    val observableButton = new ui2.Button("Okay") with ObservableClicks
    val buttonClickCountObserver = new ButtonCountObserver
    observableButton.addObserver(buttonClickCountObserver)

    for (i <- 1 to 3)
      observableButton.click()

    if (buttonClickCountObserver.count == 3)
      println("Everything works! buttonClickCountObserver.count is 3!")
  }
}