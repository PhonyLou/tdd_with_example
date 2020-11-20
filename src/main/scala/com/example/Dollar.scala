package com.example

class Dollar(override protected val amount: Int, currency: String) extends Money {

  override def times(i: Int): Dollar = Money.dollar(this.amount * i)

  override val currencyValue: String = currency
}
