package com.example

class Bank() {

  def reduce(source: Expression, to: String): Money = {
    val sum: Sum = source.asInstanceOf[Sum]
    val amount = sum.augend.amount + sum.addend.amount
    new Money(amount, to)
  }

}
