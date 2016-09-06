package com.pkg

/**
  * Practice on higher-order functions.
  */
object ListOps {
  /*
  Template for a recursive function.

  def listFun[X, Y](list: List[X]): Y = list match {
    case Nil => ???
    case head :: tail => head listFun(tail)
  }
  */

  // Fairly straightforward, but not stack-safe
  def foldRight[X, Y](list: List[X], zero: Y)(f: (X, Y) => Y): Y = list match {
    case Nil => zero
    case head :: tail => f(head, foldRight(tail, zero)(f))
  }

  // Tail recursive, works left to right.
  def foldLeft[X, Y](list: List[X], zero: Y)(f: (Y, X) => Y): Y = list match {
    case Nil => zero
    case head :: tail => foldLeft(tail, f(zero, head))(f)
  }

  // Finds the length of the list. Try with both foldRight and foldLeft.
  def length[X](list: List[X]): Int = foldLeft(list, 0)((z, h) => 1 + z)

  // Reverses the list. Try with both foldRight and foldLeft. You might need :+,
  // which adds one element to the end of a list.
  def reverse[X](list: List[X]): List[X] = foldLeft(list, List[X]())((ft, h) => h :: ft)

  // A simple append for two lists
  def simpleAppend[X](l1: List[X], l2: List[X]): List[X] = l1 match {
    case Nil => l2
    case head :: tail => head :: simpleAppend(tail, l2)
  }

  // Write it with foldRight and foldLeft.
  def append[X](l1: List[X], l2: List[X]): List[X] = ???

  // Combines the lists together for the final answer.
  def flatMap[X, Y](xs: List[X])(f: X => List[Y]): List[Y] = ???
}
