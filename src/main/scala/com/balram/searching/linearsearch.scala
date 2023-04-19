package com.balram.searching

object linearsearch {
  def apply(list: List[Int], target: Int, counter: Int = 1): Int = list match {
    case head :: tail => if (head == target) counter else apply(tail, target, counter + 1)
  }
}
