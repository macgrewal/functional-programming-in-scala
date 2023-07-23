package chapter2

object Exercise2_4 {
  def curry[A, B, C](f: (A, B) => C): A => B => C = a => b => f(a, b)
  /*

  scala> def repeat(c: Char, n: Int): String = List.fill(n)(c).mkString
  def repeat(c: Char, n: Int): String

  scala> repeat('A', 5)
  val res0: String = AAAAA

  scala> val curry_repeat = curry(repeat)
  val curry_repeat: Char => (Int => String) = chapter2.Exercise2_4$$$Lambda$5828/109500301@70713dc

  scala> curry_repeat('A')(5)
  val res1: String = AAAAA

   */
}

object Exercise2_5 {
  def uncurry[A, B, C](f: A => B => C): (A, B) => C = (a, b) => f(a)(b)

  /*

  ...following on from above

  scala> val uncurry_repeat = uncurry(curry_repeat)
  val uncurry_repeat: (Char, Int) => String = chapter2.Exercise2_5$$$Lambda$5840/1746354863@7497ccec

  scala> uncurry_repeat('A', 5)
  val res3: String = AAAAA

   */
}

object Exercise2_6 {
  def compose[A, B, C](f: B => C, g: A => B): A => C = a => f(g(a))
}
