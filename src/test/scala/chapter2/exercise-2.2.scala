package chapter2

import base.UnitSpec

import java.time.LocalDateTime

class SortingCheckSpec extends UnitSpec {

  private val sortedIntArray = Array(1, 2, 3)
  private val unsortedIntArray = sortedIntArray.reverse
  private val intCheck: (Int, Int) => Boolean = (a, b) => a < b

  private val sortedStringArray = Array("apple", "bat", "cat")
  private val unsortedStringArray = sortedStringArray.reverse
  private val stringCheck: (String, String) => Boolean = (a, b) => a < b

  private val sortedDateArray = (0 until 4).toArray.map(LocalDateTime.now().plusDays(_))
  private val unsortedDateArray = sortedDateArray.reverse
  private val dateCheck: (LocalDateTime, LocalDateTime) => Boolean = (a, b) => a.isBefore(b)

  "Calling isSorted on an unsorted array" should "fail with an array of integers" in {
    assertResult(false)(SortingCheck.isSorted(unsortedIntArray, intCheck))
  }

  it should "fail with an array of strings" in {
    assertResult(false)(SortingCheck.isSorted(unsortedStringArray, stringCheck))
  }

  it should "fail with an array of dates" in {
    assertResult(false)(SortingCheck.isSorted(unsortedDateArray, dateCheck))
  }

  "Calling isSorted on a sorted array" should "pass with an array of integers" in {
    assertResult(true)(SortingCheck.isSorted(sortedIntArray, intCheck))
  }

  it should "pass with an array of strings" in {
    assertResult(true)(SortingCheck.isSorted(sortedStringArray, stringCheck))
  }

  it should "pass with an array of dates" in {
    assertResult(true)(SortingCheck.isSorted(sortedDateArray, dateCheck))
  }
}
