package ui2

import observer._

trait ObservableClicks extends Clickable with Subject {
  abstract override def click() = {
    // we need an abstract keyword on ObservableClicks.click to
    // tell the compiler (and the reader) that click is not yet fully
    // implemented, even though ObservableClicks.click has a body

    super.click() // will be bound when this trait is mixed into an
                  // instance that defines a concrete click method
    notifyObservers
  }
}