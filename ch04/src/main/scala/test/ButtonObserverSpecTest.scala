import observer._
import ui.{ButtonCountObserver, ObservableButton}

object ButtonObserverTest {
  def main(args: Array[String]): Unit = {
    val observableButton = new ObservableButton("Okay")
    val buttonObserver = new ButtonCountObserver
    observableButton.addObserver(buttonObserver)
    for (i <- 1 to 3) {
      observableButton.click()
    }
    if (buttonObserver.count == 3)
      println("Everything works! buttonObserver.count is 3!")
  }
}