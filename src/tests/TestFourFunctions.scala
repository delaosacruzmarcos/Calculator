package tests
import org.scalatest._
import calculator.model.Calculator
class TestFourFunctions extends FunSuite {

  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }
  test("Lab test case 1"){
    val calculator: Calculator = new Calculator()
    calculator.numberPressed(5)
    calculator.multiplyPressed()
    calculator.numberPressed(4)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 20.0), calculator.displayNumber())
  }
  test("Lab test case 2"){
    val calculator2: Calculator = new Calculator()
    calculator2.numberPressed(3)
    calculator2.addPressed()
    calculator2.numberPressed(4)
    calculator2.decimalPressed()
    calculator2.numberPressed(3)
    calculator2.equalsPressed()
    assert(equalDoubles(calculator2.displayNumber(), 7.3), calculator2.displayNumber())
  }
  test("Test case Division 1"){
    val calculator3: Calculator = new Calculator()
    calculator3.numberPressed(1)
    calculator3.numberPressed(0)
    calculator3.dividePressed()
    calculator3.numberPressed(2)
    calculator3.equalsPressed()
    assert(equalDoubles(calculator3.displayNumber(), 5.0), calculator3.displayNumber())
  }
  test("Test case Subtraction 1"){
    val calculator4: Calculator = new Calculator()
    calculator4.numberPressed(3)
    calculator4.numberPressed(6)
    calculator4.subtractPressed()
    calculator4.numberPressed(1)
    calculator4.numberPressed(8)
    calculator4.equalsPressed()
    calculator4.subtractPressed()
    calculator4.numberPressed(9)
    calculator4.equalsPressed()
    assert(equalDoubles(calculator4.displayNumber(), 9.0), calculator4.displayNumber())
  }
  test("Handout test case 1"){
    val calculator5: Calculator = new Calculator()
    calculator5.numberPressed(1)
    calculator5.decimalPressed()
    calculator5.decimalPressed()
    calculator5.numberPressed(2)
    calculator5.decimalPressed()
    calculator5.addPressed()
    calculator5.numberPressed(4)
    calculator5.decimalPressed()
    calculator5.numberPressed(3)
    calculator5.equalsPressed()
    assert(equalDoubles(calculator5.displayNumber(), 5.5), calculator5.displayNumber())
  }
  test("Handout test case 2"){
    val calculator6: Calculator = new Calculator
    calculator6.numberPressed(1)
    calculator6.decimalPressed()
    calculator6.decimalPressed()
    calculator6.numberPressed(2)
    calculator6.decimalPressed()
    calculator6.addPressed()
    calculator6.decimalPressed()
    calculator6.numberPressed(3)
    calculator6.equalsPressed()
    assert(equalDoubles(calculator6.displayNumber(), 1.5), calculator6.displayNumber())
  }
}
