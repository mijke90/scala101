package nl.sogyo.fp

object PartialApplication {
  def sum(x: Int, y: Int): Int = x + y

  def successor():Int => Int = sum(1, _)
  def predecessor():Int => Int = sum(-1, _)
}
