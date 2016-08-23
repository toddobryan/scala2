package com.pkg

import org.scalatest.FunSuite
import org.scalatest.Matchers._

/**
  * Tests for Rational class.
  */
class RationalTest extends FunSuite {
  val oneHalf = new Rational(1, 2)
  val oneThird = new Rational(1, 3)
  val threeFourths = new Rational(3, 4)
  val negOneSeventh = new Rational(-1, 7)

  test("toString") {
    oneHalf.toString shouldEqual "1 / 2"
    oneThird.toString shouldEqual "1 / 3"
    threeFourths.toString shouldEqual "3 / 4"
    negOneSeventh.toString shouldEqual "-1 / 7"
  }

  test("+") {
    (oneHalf + oneThird).toString shouldEqual "4 / 6"
    (oneThird + threeFourths).toString shouldEqual "13 / 12"
  }

  test("*") {
    (oneHalf * oneThird).toString shouldEqual "1 / 6"
    (oneThird * threeFourths).toString shouldEqual "3 / 12"
  }
}
