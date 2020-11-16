package com.example

case class Franc(amount: Int) {

  def times(i: Int): Franc = Franc(amount * i)

}
