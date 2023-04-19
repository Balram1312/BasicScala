package com.balram.mathcalculations

object factorial {
  def apply(x:Int):Int = if (x < 1) 1 else x*apply(x-1)
}
