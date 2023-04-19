package com.balram.listoperations

object reverse {
  def apply(x: List[Int]): List[Int] = {
    x match {
      case head :: tail => apply(tail) :+ head
      case Nil => List[Int]()
    }
  }
}
