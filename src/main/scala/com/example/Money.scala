package com.example

class Money {

  protected val amount: Int = 0

  override def equals(money: Any): Boolean = {
    money match {
      case m: Money => (m.amount == amount) && getClass.equals(money.getClass)
      case _ => false
    }
  }
}
