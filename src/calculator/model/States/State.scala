package calculator.model.States
import calculator.model.Calculator
abstract class State(mode: Calculator) {

  def displayNumber():Double

  def clearPressed()

  def numberPressed(number: Int)

  def dividePressed()

  def multiplyPressed()

  def subtractPressed()

  def addPressed()

  def equalsPressed()

  def decimalPressed()

}
