package com.example

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MultiplicationSpec extends AnyWordSpec with Matchers {

  "Multiplication Spec" should {
    "return 10 dollars when multiplication given 5 dollars and times is 2" in {
      val five: Dollar = Dollar(5)
      five.times(2)
      five.amount shouldEqual 10
    }
  }
}
