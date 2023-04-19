package com.balram.searching

object binarysearch {
  def apply[T](array: Array[T], value: T)(implicit arithmetic: Numeric[T]): Int = {
    var left: Int = 0
    var right: Int = array.length - 1
    while (right > left) {
      val mid = left + (right - left) / 2
      val comp = arithmetic.compare(array(mid), value)
      if (comp == 0)
        return mid+1 //negative if test < value
      else if (comp > 0) //list(mid) > value
        right = mid - 1
      else if (comp < 0) //list(mid) < value
        left = mid + 1
    }
    -1
  }
}
