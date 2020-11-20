package com.example

class Money(protected val amountInput: Int, protected val currencyInput: String) {

  protected val amount: Int = amountInput

  override def equals(money: Any): Boolean = {
    money match {
      case m: Money => (m.amount == amount) && currency.equals(m.currency)
      case _ => false
    }
  }

  def times(multiplier: Int): Money = new Money(amount * multiplier, currency)

  protected val currencyValue: String = currencyInput

  def currency(): String = currencyValue

  override def toString: String = s"$amount ${currency()}"
}

object Money {
  def franc(amount: Int) = new Franc(amount, "CHF")

  def dollar(amount: Int) = new Dollar(amount, "USD")
}
