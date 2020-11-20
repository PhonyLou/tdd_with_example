package com.example

class Franc(override val amount: Int, currency: String = "CHF") extends Money {

  override val currencyValue: String = currency

  override def times(i: Int): Franc = Money.franc(amount * i)
}
