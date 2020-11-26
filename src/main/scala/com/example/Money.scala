package com.example

class Money(val amount: Int, val currency: String) extends Expression {

  def plus(money: Money): Expression = new Money(amount + money.amount, currency)


  override def equals(money: Any): Boolean = {
    money match {
      case m: Money => (m.amount == amount) && currency.equals(m.currency)
      case _ => false
    }
  }

  def times(multiplier: Int): Money = new Money(amount * multiplier, currency)

  override def toString: String = s"$amount $currency"
}

object Money {
  def franc(amount: Int) = new Money(amount, "CHF")

  def dollar(amount: Int) = new Money(amount, "USD")
}
