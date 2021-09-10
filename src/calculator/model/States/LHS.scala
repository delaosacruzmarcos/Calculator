package calculator.model.States

import calculator.model.Calculator

class LHS(mode:Calculator) extends State(mode) {


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
    this.mode.LHS = retString.toDouble
  }

  override def displayNumber(): Double = {
    this.mode.LHS
  }

//--------------------- operators ----------------------------------
  override def dividePressed(): Unit = {
    this.mode.operator = (LHS: Double , RHS: Double) => LHS / RHS
    this.mode.Num = List()
    this.mode.decimal = "."
    this.mode.state = new Inter(mode)
  }

  override def multiplyPressed(): Unit = {
    this.mode.operator = (LHS: Double , RHS: Double) => LHS * RHS
    this.mode.Num = List()
    this.mode.decimal = "."
    this.mode.state = new Inter(mode)
  }

  override def subtractPressed(): Unit = {
    this.mode.operator = (LHS: Double , RHS: Double) => LHS - RHS
    this.mode.Num = List()
    this.mode.decimal = "."
    this.mode.state = new Inter(mode)
  }

  override def addPressed(): Unit = {
    this.mode.operator = (LHS: Double , RHS: Double) => LHS + RHS
    this.mode.Num = List()
    this.mode.decimal = "."
    this.mode.state = new Inter(mode)
  }

//----------------------- Reset Methods------------------------
  override def equalsPressed(): Unit = {}

  override def clearPressed(): Unit = {
    this.mode.Num = List()
    this.mode.decimal = "."
    this.mode.LHS = 0.0
    this.mode.RHS = 0.0
    this.mode.operator = (LHS: Double , RHS: Double) => LHS + RHS
  }

  override def decimalPressed(): Unit = {
    this.mode.Num = this.mode.decimal :: this.mode.Num
    this.mode.decimal = ""
  }
}
