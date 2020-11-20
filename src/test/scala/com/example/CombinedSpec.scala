package com.example

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CombinedSpec extends AnyWordSpec with Matchers {

  "Equal Spec" should {

    "return true when compare two Dollar object with same amount" in {
      val five: Dollar = new Dollar(5, "USD")
      five shouldEqual new Dollar(5, "USD")
      five should not equal new Dollar(6, "USD")
    }

    "return true when compare two Franc object with same amount" in {
      val five: Franc = new Franc(5, "CHF")
      five shouldEqual new Franc(5, "CHF" )
      five should not equal new Franc(6, "CHF")
    }

    "return false when compare given one is Dollar and another one is Franc" in {
      new Franc(5, "CHF") equals new Dollar(5, "USD") shouldEqual false
    }
  }

  "Multiplication Spec" should {
    "Do Dollar multiplication" in {
      val five: Money = Money.dollar(5)
      five.times(2) equals new Dollar(10, "USD")
      five.times(3) equals new Dollar(15, "USD")
    }

    "Do Franc multiplication" in {
      val five: Money = Money.franc(5)
      five.times(2) equals new Franc(10, "CHF")
      five.times(3) equals new Franc(15, "CHF")
    }

  }

  "Currency" should {
    "equal USD given dollar" in {
      "USD" shouldEqual Money.dollar(1).currency
    }

    "equal CHF given franc" in {
      "CHF" shouldEqual Money.franc(1).currency
    }
  }

}
