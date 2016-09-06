package com.pkg

/**
  * Class for Rational numbers.
  */
class Rational private (val num: Int, val denom: Int) {
  override def toString = num + " / " + denom

  def +(that: Rational): Rational =
    Rational(num * that.denom + denom * that.num, denom * that.denom)

  def *(that: Rational): Rational =
    Rational(num * that.num, denom * that.denom)
}

object Rational {
  def apply(num: Int, denom: Int): Rational = new Rational(num, denom)

  def apply(num: Int): Rational = new Rational(num, 1)
}
