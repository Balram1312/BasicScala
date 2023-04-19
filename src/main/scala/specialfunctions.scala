import com.balram.listoperations._
object specialfunctions {
  def main(args: Array[String]): Unit = {


    val str1 = List("delhi", "raipur", "jaipur", "jodhpur", "chennai", "chandigarh")
    println(uppercase(str1)+"\n")

    //Map Function
    println(str1.map(_.toUpperCase()).map(_.substring(0, 3)))
    println()
    case class storage(name: String, surname: String, age: Int, address: List[Any])
    val ListOfStorage = List(
      storage("John", "walton", 25, List(24, "washington", "usa")),
      storage("molly", "albert", 23, List(10, "Los Angles", "usa")),
      storage("Van der", "Lyn", 22, List(19, "Warsaw", "Poland"))
    )
    println(ListOfStorage)
    println(ListOfStorage.map(_.name))
    //flatMap() & filter
    println(ListOfStorage.flatMap(_.address).filter(_.isInstanceOf[Int])+"\n")

    //reduce()
    //printing largest number in the list
    val num1 = 2 :: 5 :: 8 :: 12 :: Nil
    println(num1.reduce((x, y) => if (x > y) x else y)+"\n")

    //Zip
    val animals = List("Tiger","Elephant","Dragon","Deer","Bear","Monkey")
    val iter = List(1,2,1,3,1,2)
    println(iter.zip(animals))
    println(iter.zip(animals).map(n => n._2 * n._1))

    //lazyZip (formally known as Zipped in scala 2.12)
    println(iter.lazyZip(animals).map((num,str)=>str*num))
  }
}
