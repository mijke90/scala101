package nl.sogyo.fp

object FunctionsAsFirstClassCitizens {
  def Square(x: Int): Int = x * x
  def SquareToo = Square _
}
