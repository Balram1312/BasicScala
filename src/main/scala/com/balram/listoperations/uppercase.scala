package com.balram.listoperations

object uppercase {
  def apply(x: List[String]): List[String] = {
    x match {
      case Nil => Nil
      case head :: tail => head.toUpperCase() :: apply(tail)
    }
  }
}
