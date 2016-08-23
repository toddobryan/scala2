package com.pkg

import org.scalatest.FunSuite
import org.scalatest.Matchers._

/**
  * Created by toddobry on 8/23/16.
  */
class ListOpsTest extends FunSuite {
  import ListOps._

  test("length") {
    length(Nil) shouldEqual 0
    length(List(1, 2, 3)) shouldEqual 3
    length(List("a", "b", "c", "d", "e")) shouldEqual 5
    length(List(List(1, 2), List(3), List(4))) shouldEqual 3
  }

  test("reverse a list") {
    reverse(List(1, 2, 3)) shouldEqual List(3, 2, 1)
    reverse(Nil) shouldEqual Nil
    reverse(List("a", "b", "c", "d")) shouldEqual List("d", "c", "b", "a")
  }

  test("simpleAppend") {
    simpleAppend(Nil, Nil) shouldEqual Nil
    simpleAppend(List(1, 2, 3), List(4, 5)) shouldEqual List(1, 2, 3, 4, 5)
    simpleAppend(List("a"), List("b")) shouldEqual List("a", "b")
  }

  test("append") {
    append(Nil, Nil) shouldEqual Nil
    append(List(1, 2, 3), List(4, 5)) shouldEqual List(1, 2, 3, 4, 5)
    append(List("a"), List("b")) shouldEqual List("a", "b")
  }

  test("flatMap") {
    flatMap(List(1, 2, 3))(x => List(x, x)) shouldEqual List(1, 1, 2, 2, 3, 3)
    flatMap(List(3, 4))(x => (1 to x).toList) shouldEqual List(1, 2, 3, 1, 2, 3, 4)
  }
}
