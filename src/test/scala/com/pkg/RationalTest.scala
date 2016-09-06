package com.pkg

import org.scalatest.FunSuite
import org.scalatest.Matchers._

/**
  * Tests for Rational class.
  */
class RationalTest extends FunSuite {
  val oneHalf = Rational(1, 2)
  val oneThird = Rational(1, 3)
  val threeFourths = Rational(3, 4)
  val negOneSeventh = Rational(-1, 7)

  test("default Int thing") {
    Rational(5).toString shouldEqual "5 / 1"
  }

  test("toString") {
    oneHalf.toString shouldEqual "1 / 2"
    oneThird.toString shouldEqual "1 / 3"
    threeFourths.toString shouldEqual "3 / 4"
    negOneSeventh.toString shouldEqual "-1 / 7"
  }

  test("+") {
    (oneHalf + oneThird).toString shouldEqual "5 / 6"
    (oneThird + threeFourths).toString shouldEqual "13 / 12"
  }

  test("*") {
    (oneHalf * oneThird).toString shouldEqual "1 / 6"
    (oneThird * threeFourths).toString shouldEqual "3 / 12"
  }
}
