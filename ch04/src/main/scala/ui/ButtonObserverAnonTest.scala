package ui

import observer._

object ButtonObserverAnonTest {
  def main(args: Array[String]): Unit = {

    val observableButton = new Button("Okay") with Subject {
      override def click() = {
        super.click()
        notifyObservers
      }
    }

    val buttonObserver = new ButtonCountObserver
    observableButton.addObserver(buttonObserver)
    for (i <- 1 to 3)
      observableButton.click()

    if (buttonObserver.count == 3)
      println("Everything works! buttonObserver.count is 3!")
  }
}