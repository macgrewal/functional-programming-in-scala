package chapter2

import base.UnitSpec

class FibonacciSpec extends UnitSpec {

  "The Fibonacci function" should "match first 20 known numbers" in {

    // sequence taken from https://en.wikipedia.org/wiki/Fibonacci_number#List_of_Fibonacci_numbers
    val knownFibSequence = List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765)
    knownFibSequence.zipWithIndex.foreach {
      case (result, index) => assertResult(result)(Fibonacci.atIndex(index))
    }
  }

  "The 100th number in the Fibonacci sequence" should "be 218922995834555169026" in {

    assertResult(BigInt("218922995834555169026")) {
      Fibonacci.atIndex(99)
    }
  }
}
