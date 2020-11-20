package com.example

class Dollar(override protected val amount: Int, currency: String) extends Money(amount, currency) {

  override def times(i: Int): Dollar = Money.dollar(this.amount * i)

  override val currencyValue: String = currency
}
