package com.example

class Money {

  protected val amount: Int = 0

  override def equals(obj: Any): Boolean = {
    obj match {
      case m: Money => m.amount == amount
      case _ => false
    }
  }
}
