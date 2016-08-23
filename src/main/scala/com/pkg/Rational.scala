package com.pkg

/**
  * Created by toddobry on 8/23/16.
  */
class Rational(num: Int, denom: Int) {
  override def toString = ???

  def +(that: Rational): Rational = ???

  def *(that: Rational): Rational = ???

}

object Rational {
  def apply(num: Int): Rational = new Rational(num, 1)
}
