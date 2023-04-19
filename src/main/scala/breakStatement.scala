import scala.annotation.tailrec
import scala.util.control._
object breakStatement {
  @tailrec
  private def table(x:Int, Stop:Int=11, y:Int=1):Int = {
    val loop = new Breaks         //defining break instant
    loop.breakable {
      for (i <- 1 to 10) {
        // break block
        // loop break if i is reach to stop
        if (i == Stop+1) loop.break()
        println(f"$y x $i = ${y * i}")
      }
    }
    println()

    if (y<x) table(x,Stop,y+1) else 1 //recursive call till y"counter" is less then x"table range"
  }

  def main(args:Array[String]): Unit = {
    table(5,4)
 }
}
