package ui3

import observer._
import ui.ButtonCountObserver

object ButtonClickableObserverVetoableSpec2 {
  def main(args: Array[String]): Unit = {
    val observableButton =
      new Button("Okay") with ObservableClicks with VetoableClicks {
        maxAllowed = 2
      }
//    observableButton.maxAllowed mustEqual 2
//    val buttonClickCountObserver = new ButtonCountObserver
//    observableButton.addObserver(buttonClickCountObserver)
//    for (i <- 1 to 3) observableButton.click()
//    buttonClickCountObserver.count mustEqual 2
  }
}