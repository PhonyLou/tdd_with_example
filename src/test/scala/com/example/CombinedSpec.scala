package com.example

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CombinedSpec extends AnyWordSpec with Matchers {

  "Equal Spec" should {

    "return true when compare two Dollar object with same amount" in {
      val five: Dollar = new Dollar(5)
      five shouldEqual new Dollar(5)
      five should not equal new Dollar(6)
    }

    "return true when compare two Franc object with same amount" in {
      val five: Franc = new Franc(5)
      five shouldEqual new Franc(5)
      five should not equal new Franc(6)
    }

    "return false when compare given one is Dollar and another one is Franc" in {
      new Franc(5) equals new Dollar(5) shouldEqual false
    }
  }

  "Multiplication Spec" should {
    "Do Dollar multiplication" in {
      val five: Money = Money.dollar(5)
      five.times(2) shouldEqual new Dollar(10)
      five.times(3) shouldEqual new Dollar(15)
    }

    "Do Franc multiplication" in {
      val five: Money = Money.franc(5)
      five.times(2) shouldEqual new Franc(10)
      five.times(3) shouldEqual new Franc(15)
    }

  }

}
