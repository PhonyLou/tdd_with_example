package com.example

class Franc(override val amount: Int) extends Money {

  def times(i: Int): Franc = new Franc(amount * i)

}
