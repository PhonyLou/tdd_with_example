package com.example

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class FrancMultiplicationSpec extends AnyWordSpec with Matchers {

  "FrancMultiplication Spec" should {
    "Do multiplication" in {
      val five: Franc = Franc(5)
      five.times(2) shouldEqual Franc(10)
      five.times(3) shouldEqual Franc(15)
    }

    "return true when compare two Franc object with same amount" in {
      val five: Franc = Franc(5)
      five shouldEqual Franc(5)
      five should not equal Franc(6)
    }
  }
}
