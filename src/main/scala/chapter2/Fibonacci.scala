package chapter2

import scala.annotation.tailrec

trait Fibonacci {
  def atIndex(index: BigInt): BigInt = {

    // Needs to be Pascal cased for pattern matching
    val Zero = BigInt(0)

    // Pattern matching on BigInt: http://dhruba.name/2013/10/22/scala-cookbook-pattern-matching-on-bigint/
    @tailrec
    def loop(position: BigInt, current: BigInt, next: BigInt): BigInt = position match {
      case Zero => current
      case _ => loop(position - 1, next, current + next)
    }

    loop(index, 0, 1)
  }
}

object Fibonacci extends Fibonacci
