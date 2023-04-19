import com.balram.listoperations._
import com.balram.mathcalculations._
import com.balram.searching._

object test{
  def main(args:Array[String]) {
    //2 searching algorithms
    //Linear Search
    println(f"target location is ${linearsearch(List(12,4,11,45,87,98),87)} ")
    //Binary Search
    println(f"target location is ${binarysearch(Array(1,21,34,67,89,55,77),67)} ")
  }
}
