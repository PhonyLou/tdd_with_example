package com.example

abstract class Money(protected val amountInput: Int, protected val currencyInput: String) {

  protected val amount: Int = amountInput

  override def equals(money: Any): Boolean = {
    money match {
      case m: Money => (m.amount == amount) && getClass.equals(money.getClass)
      case _ => false
    }
  }

  def times(multiplier: Int): Money

  protected val currencyValue: String = currencyInput

  def currency(): String = currencyValue
}

object Money {
  def franc(amount: Int) = new Franc(amount, "CHF")

  def dollar(amount: Int) = new Dollar(amount, "USD")
}
