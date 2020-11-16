package com.example

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class EqualSpec extends AnyWordSpec with Matchers {

  "Equal Spec" should {

    "return true when compare two Dollar object with same amount" in {
      val five: Dollar = new Dollar(5)
      five shouldEqual new Dollar(5)
      five should not equal new Dollar(6)
    }
  }

}
