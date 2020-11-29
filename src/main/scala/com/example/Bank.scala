package com.example

class Bank {

  def reduce(source: Expression, to: String): Money = {
    source match {
      case m: Money => m
      case s: Sum => s.reduce(to)
    }
  }

}
