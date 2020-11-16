package com.example

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class FrancMultiplicationSpec extends AnyWordSpec with Matchers {

  "FrancMultiplication Spec" should {
    "Do multiplication" in {
      val five: Franc = new Franc(5)
      five.times(2) shouldEqual new Franc(10)
      five.times(3) shouldEqual new Franc(15)
    }

  }
}
