package com.example

case class Dollar(amount: Int) {

  def times(i: Int): Dollar = Dollar(amount * i)

}
