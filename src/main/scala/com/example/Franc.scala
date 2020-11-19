package com.example

class Franc(override val amount: Int) extends Money {

  override def times(i: Int): Franc = Money.franc(amount * i)

  override val currency: String = "CHF"
}
