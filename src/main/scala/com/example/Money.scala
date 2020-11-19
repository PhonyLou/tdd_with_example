package com.example

abstract class Money {

  protected val amount: Int = 0

  override def equals(money: Any): Boolean = {
    money match {
      case m: Money => (m.amount == amount) && getClass.equals(money.getClass)
      case _ => false
    }
  }

  def times(multiplier: Int): Money
}

object Money {
  def franc(amount: Int) = new Franc(amount)

  def dollar(amount: Int) = new Dollar(amount)
}
