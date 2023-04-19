package com.balram.listoperations

object lowercase {
  def apply(x: List[String]): List[String] = {
    x match {
      case Nil => Nil
      case head :: tail => head.toLowerCase() :: apply(tail)
    }
  }
}
