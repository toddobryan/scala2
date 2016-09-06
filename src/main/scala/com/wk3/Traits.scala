package com.wk3

case class Point(x: Int, y: Int)

trait Rectangular {
  // These methods are abstract. Must be defined by any class that mixes in the trait.
  // (Could be defined by a field, however.)
  def topLeft: Point
  def bottomRight: Point

  // These methods are concrete, because they're only defined in terms of the abstract methods.
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left

}

// Here's a rectangle class, with the mix-in

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Rectangular {

}

