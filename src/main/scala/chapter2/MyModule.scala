package chapter2

import scala.annotation.tailrec

object MyModule {

  def factorial(n: Int): Int = {
    @tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc else go(n - 1, n * acc)

    go(n, 1)
  }

  def abs(n: Int): Int = if (n < 0) -n else n

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d."
    msg.format(x, abs(x))
  }

  private def formatFactorial(x: Int) = {
    val msg = "The factorial of %d is %d."
    msg.format(x, factorial(x))
  }

  def formatResult(name: String, x: Int, f: Int => Int): String = {
    val msg = "The %s of %d is %d."
    msg.format(name, x, f(x))
  }

  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
    println(formatFactorial(7))
  }
}
