package calculator.model
import calculator.model.States._

class Calculator() {

  var state: State = new LHS(this)
  var Num: List[String] = List()
  var decimal: String = "."
  var LHS: Double = 0.0
  var RHS: Double = 0.0
  var operator: (Double, Double) => Double = (LHS: Double , RHS: Double) => LHS + RHS

  // Accessed by View. You should edit this method as you build functionality
  def displayNumber():Double = {
    this.state.displayNumber()
  }

  def clearPressed(): Unit = {
    this.state.clearPressed()
  }

  def numberPressed(number: Int): Unit = {
    this.state.numberPressed(number)
  }

  def dividePressed(): Unit = {
    this.state.dividePressed()
  }

  def multiplyPressed(): Unit = {
    this.state.multiplyPressed()
  }

  def subtractPressed(): Unit = {
    this.state.subtractPressed()
  }

  def addPressed(): Unit = {
    this.state.addPressed()
  }

  def equalsPressed(): Unit = {
    this.state.equalsPressed()
  }

  def decimalPressed(): Unit = {
    this.state.decimalPressed()
  }

}
