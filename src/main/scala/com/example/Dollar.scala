package com.example

class Dollar(override protected val amount: Int) extends Money {

  def times(i: Int): Dollar = new Dollar(this.amount * i)

  override def currency(): String = "USD"
}
