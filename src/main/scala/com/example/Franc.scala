package com.example

class Franc(override val amount: Int, currency: String) extends Money(amount, currency) {

  override def times(i: Int): Franc = new Franc(amount, currency)
}
