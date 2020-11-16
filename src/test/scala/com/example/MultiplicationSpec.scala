package com.example

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MultiplicationSpec extends AnyWordSpec with Matchers {

  "Multiplication Spec" should {
    "Do multiplication" in {
      val five: Dollar = Dollar(5)
      five.times(2) shouldEqual 10
      five.times(3) shouldEqual 15
    }

    "return true when compare two Dollar object with same amount" in {
      val five: Dollar = Dollar(5)
      five shouldEqual Dollar(5)
      five should not equal Dollar(6)
    }
  }
}
