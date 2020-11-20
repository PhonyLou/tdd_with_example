package com.example

class Dollar(override protected val amount: Int, currency: String) extends Money(amount, currency) {

  override def times(i: Int): Money = new Money(amount, currency)

}
