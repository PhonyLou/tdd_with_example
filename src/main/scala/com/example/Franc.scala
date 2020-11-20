package com.example

class Franc(override val amount: Int) extends Money {

  override val currencyValue: String = "CHF"

  override def times(i: Int): Franc = Money.franc(amount * i)
}
