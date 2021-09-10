package tests
import calculator.model.Calculator
import org.scalatest.FunSuite
class TestFullFunctionality extends FunSuite {

  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }

  test("Lab test case 1") {
    val calculator: Calculator = new Calculator()
    calculator.numberPressed(3)
    calculator.multiplyPressed()
    calculator.addPressed()
    calculator.numberPressed(4)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 7.0), calculator.displayNumber())
  }
  test("Lab test case 2") {
    val calculator2: Calculator = new Calculator
    calculator2.numberPressed(1)
    calculator2.addPressed()
    calculator2.numberPressed(2)
    calculator2.multiplyPressed()
    calculator2.decimalPressed()
    calculator2.numberPressed(8)
    calculator2.equalsPressed()
    assert(equalDoubles(calculator2.displayNumber(), 2.4), calculator2.displayNumber())
  }
  test("Lab test case 3") {
    val calculator3: Calculator = new Calculator
    calculator3.numberPressed(1)
    calculator3.addPressed()
    calculator3.numberPressed(1)
    calculator3.equalsPressed()
    calculator3.numberPressed(3)
    assert(equalDoubles(calculator3.displayNumber(), 3.0), calculator3.displayNumber())
  }
  test ("Expansion of Lab case 3"){
    val calculator01: Calculator = new Calculator
    calculator01.numberPressed(1)
    calculator01.numberPressed(2)
    calculator01.multiplyPressed()
    calculator01.numberPressed(2)
    calculator01.decimalPressed()
    calculator01.numberPressed(5)
    calculator01.equalsPressed()
    calculator01.numberPressed(3)
    assert(equalDoubles(calculator01.displayNumber(), 3.0), calculator01.displayNumber())
    calculator01.multiplyPressed()
    calculator01.numberPressed(3)
    calculator01.equalsPressed()
    calculator01.numberPressed(4)
    assert(equalDoubles(calculator01.displayNumber(), 4.0), calculator01.displayNumber())
  }
  test("Lab test case 4") {
    val calculator4: Calculator = new Calculator
    calculator4.numberPressed(1)
    calculator4.addPressed()
    calculator4.numberPressed(1)
    calculator4.clearPressed()
    calculator4.numberPressed(2)
    calculator4.addPressed()
    calculator4.numberPressed(3)
    calculator4.equalsPressed()
    calculator4.addPressed()
    calculator4.numberPressed(4)
    calculator4.equalsPressed()
    assert(equalDoubles(calculator4.displayNumber(), 9.0), calculator4.displayNumber())
  }
  test ("RHS decimal"){
    val calculator5: Calculator = new Calculator
    calculator5.numberPressed(4)
    calculator5.numberPressed(4)
    calculator5.addPressed()
    calculator5.numberPressed(6)
    calculator5.equalsPressed()
    calculator5.decimalPressed()
    calculator5.numberPressed(5)
    assert(equalDoubles(calculator5.displayNumber(), 0.5), calculator5.displayNumber())
  }
  test("All operators"){
    val calculator6: Calculator = new Calculator
    calculator6.numberPressed(2)
    calculator6.addPressed()
    calculator6.numberPressed(2)
    calculator6.multiplyPressed()
    calculator6.numberPressed(4)
    calculator6.subtractPressed()
    calculator6.numberPressed(6)
    calculator6.dividePressed()
    calculator6.numberPressed(2)
    calculator6.equalsPressed()
    assert(equalDoubles(calculator6.displayNumber(), 5.0), calculator6.displayNumber())
  }
  test("Dividing by decimal second time around"){
    val calculator7: Calculator = new Calculator
    calculator7.numberPressed(8)
    calculator7.dividePressed()
    calculator7.decimalPressed()
    calculator7.numberPressed(5)
    calculator7.dividePressed()
    calculator7.decimalPressed()
    calculator7.numberPressed(5)
    calculator7.equalsPressed()
    assert(equalDoubles(calculator7.displayNumber(), 32.0), calculator7.displayNumber())
  }
}

