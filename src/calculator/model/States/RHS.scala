package calculator.model.States
import calculator.model.Calculator
class RHS(mode:Calculator) extends State(mode){

// --------------------------- Reset Suite -------------------------------
  override def clearPressed(): Unit = {
    this.mode.decimal = "."
    this.mode.Num = List()
    this.mode.LHS = 0.0
    this.mode.RHS = 0.0
    this.mode.operator = (LHS: Double , RHS: Double) => LHS + RHS
    this.mode.state = new LHS(mode)
  }

  override def equalsPressed(): Unit = {
    this.mode.LHS = this.mode.operator(this.mode.LHS,this.mode.RHS)
    this.mode.RHS = 0.0
    this.mode.operator = (LHS: Double , RHS: Double) => LHS + RHS
    this.mode.Num = List()
    this.mode.decimal = "."
    this.mode.state = new LHS(mode)
  }

  override def decimalPressed(): Unit = {
    this.mode.Num = this.mode.decimal :: this.mode.Num
    this.mode.decimal = ""
  }

  //--------------------------Control Flow----------------------------
  override def numberPressed(number: Int): Unit = {
    val numberS: String = number.toString
    this.mode.Num = numberS :: this.mode.Num
    numConversion()
    displayNumber()
  }

  def numConversion(): Unit = {
    val reversed: List[String] = this.mode.Num.reverse
    val numStr: List[String] = reversed
    var retString: String = numStr.mkString
    this.mode.RHS = retString.toDouble
  }

  override def displayNumber(): Double = {
    this.mode.RHS
  }

//-------------------------- operators--------------------------------------
  override def dividePressed(): Unit = {
    // Preform and display the original calculation
    this.equalsPressed()
    // Set up the next calculation
    this.mode.state.dividePressed()
  }

  override def multiplyPressed(): Unit = {
    // Preform and display the original calculation
    this.equalsPressed()

    // Set up the next calculation
    this.mode.state.multiplyPressed()
  }

  override def subtractPressed(): Unit = {
    // Preform and display the original calculation
    this.equalsPressed()

    // Set up the next calculation
    this.mode.state.subtractPressed()
  }

  override def addPressed(): Unit = {
    // Preform and display the original calculation
    this.equalsPressed()

    // Set up the next calculation
    this.mode.state.addPressed()
  }
}
