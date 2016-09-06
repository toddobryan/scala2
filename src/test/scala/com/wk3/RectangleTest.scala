package com.wk3

import org.scalatest.FunSuite;
import org.scalatest.Matchers._;

/**
  * Created by toddobry on 9/6/16.
  */
class RectangleTest extends FunSuite {
  test("Create Rectangle and call methods") {
    val rect = new Rectangle(Point(5, 7), Point(25, 37))
    rect.left shouldEqual 5
    rect.right shouldEqual 25
    rect.width shouldEqual 20

    // define top, bottom, and height here and in Rectangular
  }
}
