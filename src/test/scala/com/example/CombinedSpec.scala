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

    "return false when compare given one is Dollar and another one is Franc" in {
      Money.franc(5) should not equal Money.dollar(5)
    }
  }

  "Multiplication Spec" should {
    "Do Dollar multiplication" in {
      val five: Money = Money.dollar(5)
      five.times(2) shouldEqual Money.dollar(10)
      five.times(3) shouldEqual Money.dollar(15)
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

  "Add spec" should {
    "return sum value give two dollar" in {
      val sum = Money.dollar(5).plus(Money.dollar(5))
      sum shouldEqual Money.dollar(10)
    }

    "Another add test" in {
      val five = Money.dollar(5)
      val sum: Expression = five.plus(five)
      val bank = new Bank()
      val reduced: Money = bank.reduce(sum, "USD")
      Money.dollar(10) shouldEqual reduced
    }

    "test plus returns Sum" in {
      val five = Money.dollar(5)
      val result = five.plus(five)
      val sum: Sum = result
      five shouldEqual sum.augend
      five shouldEqual sum.addend
    }

    "test reduce Sum" in {
      val sum: Expression = new Sum(Money.dollar(3), Money.dollar(4))
      val bank = new Bank()
      val reduced: Money = bank.reduce(sum, "USD")
      Money.dollar(7) shouldEqual reduced
    }
  }

}
