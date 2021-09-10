package calculator.model.States

import calculator.model.Calculator

class Inter(mode: Calculator) extends State(mode) {

  // --------------------------- Reset Suite -------------------------------
  override def clearPressed(): Unit = {
    this.mode.Num = List()
    this.mode.decimal = "."
    this.mode.LHS = 0.0
    this.mode.RHS = 0.0
    this.mode.operator = (LHS: Double , RHS: Double) =>  LHS + RHS
    this.mode.state = new LHS(mode)
  }

  override def equalsPressed(): Unit = {}

  override def decimalPressed(): Unit = {
    this.mode.state = new RHS(mode)
    this.mode.Num = "." :: "0" :: this.mode.Num
    this.mode.decimal = ""

  }

  //--------------------------Control Flow----------------------------
  override def numberPressed(number: Int): Unit = {
    this.mode.state = new RHS(mode)
    this.mode.state.numberPressed(number)
  }
  override def displayNumber(): Double = {
    this.mode.LHS
  }

  //-------------------------- operators--------------------------------------
  override def dividePressed(): Unit = {
    this.mode.operator = (LHS: Double , RHS: Double) => LHS / RHS
  }

  override def multiplyPressed(): Unit = {
    this.mode.operator = (LHS: Double , RHS: Double) => LHS * RHS
  }

  override def subtractPressed(): Unit = {
    this.mode.operator = (LHS: Double , RHS: Double) => LHS - RHS
  }

  override def addPressed(): Unit = {
    this.mode.operator = (LHS: Double , RHS: Double) => LHS + RHS
  }

}
