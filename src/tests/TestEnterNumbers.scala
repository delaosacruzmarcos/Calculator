package tests

import calculator.model.Calculator
import org.scalatest.FunSuite

class TestEnterNumbers extends FunSuite {

  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }

  // Example test case
  test("Enter Numbers Test") {
    val calculatorQ: Calculator = new Calculator()

    calculatorQ.numberPressed(1)
    calculatorQ.numberPressed(2)
    calculatorQ.numberPressed(3)
    calculatorQ.numberPressed(4)
    calculatorQ.numberPressed(5)
    calculatorQ.numberPressed(6)
    calculatorQ.numberPressed(7)
    calculatorQ.numberPressed(8)
    calculatorQ.numberPressed(9)


    assert(equalDoubles(calculatorQ.displayNumber(), 123456789.0), calculatorQ.displayNumber())
  }
  test("Lab test case 1") {
    val calculator: Calculator = new Calculator()
    calculator.numberPressed(4)
    calculator.numberPressed(1)
    calculator.numberPressed(7)
    assert(equalDoubles(calculator.displayNumber(), 417.0), calculator.displayNumber())
  }
  test("Lab test case 2") {
    val calculator2: Calculator = new Calculator()
    calculator2.numberPressed(0)
    calculator2.numberPressed(0)
    calculator2.numberPressed(0)
    calculator2.numberPressed(0)
    calculator2.numberPressed(2)
    calculator2.decimalPressed()
    calculator2.numberPressed(3)
    assert(equalDoubles(calculator2.displayNumber(), 2.3), calculator2.displayNumber())
  }
  test("Lab test case 3") {
    val calculator3: Calculator = new Calculator()
    calculator3.numberPressed(2)
    calculator3.decimalPressed()
    calculator3.decimalPressed()
    calculator3.numberPressed(3)
    calculator3.decimalPressed()
    calculator3.numberPressed(5)
    assert(equalDoubles(calculator3.displayNumber(), 2.35), calculator3.displayNumber())
  }
  test("Lab test case 4") {
    val calculator4: Calculator = new Calculator()
    calculator4.decimalPressed()
    calculator4.numberPressed(0)
    calculator4.numberPressed(0)
    calculator4.numberPressed(0)
    calculator4.decimalPressed()
    calculator4.numberPressed(5)
    assert(equalDoubles(calculator4.displayNumber(), 0.0005), calculator4.displayNumber())
  }
  test("Handout test case 1") {
    val calculator5: Calculator = new Calculator
    calculator5.decimalPressed()
    calculator5.numberPressed(3)
    assert(equalDoubles(calculator5.displayNumber(), 0.3), calculator5.displayNumber())
  }
  test("Checking out the decimal pressed "){
    val calculator6: Calculator = new Calculator
    calculator6.decimalPressed()
    calculator6.numberPressed(3)
    calculator6.numberPressed(0)
    calculator6.numberPressed(3)
    assert(equalDoubles(calculator6.displayNumber(),0.303),calculator6.displayNumber())
  }

}
