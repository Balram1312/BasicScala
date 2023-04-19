//It contains various type of scala collection like list , array , map
object scalacollections {
  def main(args:Array[String]): Unit = {

    val arr: Array[Int] = Array(1,5,6,2,3,4)
    println(f"3 index of arr is ${arr(3)}\n")

    val list:List[String] = "Apple" :: "Banana" :: "Mango" :: Nil
    println(f"head of list is ${list.head} \ntail of list is ${list.tail}\n")

    val dictionary:Map[String,Long] = Map("Balram"->9412345678L,"Rahul"->7587123456L)
    //val dictionary:Map[String,Long] = Map()
    if (dictionary.nonEmpty) {
      println(s"names in the dictionary are ${dictionary.keys}")
      println(s"numbers in the dictionary are ${dictionary.values}\n")
    } else print("dictionary is empty\n")

    val uid : Set[Int] = Set(111,112,112,113,114,115)
    if (uid.isEmpty) println("no uid listed\n") else {
      println(s"head of the uid are ${uid.head}")
      println(s"tail of the uid are ${uid.tail}\n")
    }

    val student1 = ("Ajay",24,9.5)
    println(f"Name of student1 is ${student1._1}")
    println(f"Age of student1 is ${student1._2}")
    println(f"Cgpa of student1 is ${student1._3}\n")


  }
}
