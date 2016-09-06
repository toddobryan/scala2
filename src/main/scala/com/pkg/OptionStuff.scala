package com.pkg

/**
  * What to do with Option[].
  */
object OptionStuff {
  def toIntSafe(s: String): Option[Int] = {
    try {
      Some(s.toInt)
    } catch {
      case e: NumberFormatException => None
    }
  }

}
