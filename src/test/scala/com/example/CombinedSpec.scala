package com.example

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CombinedSpec extends AnyWordSpec with Matchers {

  "Equal Spec" should {

    "return true when compare two Dollar object with same amount" in {
      val five: Money = Money.dollar(5)
      five shouldEqual Money.dollar(5)
      five should not equal Money.dollar(6)
    }

    "return true when compare two Franc object with same amount" in {
      val five: Money = Money.franc(5)
      five shouldEqual new Franc(5, "CHF" )
      five should not equal new Franc(6, "CHF")
    }

    "return false when compare given one is Dollar and another one is Franc" in {
      Money.franc(5) equals Money.dollar(5) shouldEqual false
    }
  }

  "Multiplication Spec" should {
    "Do Dollar multiplication" in {
      val five: Money = Money.dollar(5)
      five.times(2) shouldEqual Money.dollar(10)
      five.times(3) shouldEqual Money.dollar(15)
    }

    "Do Franc multiplication" in {
      val five: Money = Money.franc(5)
      five.times(2) shouldEqual Money.franc(10)
      five.times(3) shouldEqual Money.franc(15)
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
