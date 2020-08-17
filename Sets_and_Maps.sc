// Sets example

object Sets_and_Map {
  val fruit = Set("apple", "oranges", "peach", "mango")
                                                  //> fruit  : scala.collection.immutable.Set[String] = Set(apple, oranges, peach, 
                                                  //| mango)
  
  fruit("peach")                                  //> res0: Boolean = true
  // It could be noticed that when a set element is invoked wherein the element actually exists then we get to see a boolean value returning true.
  // In the below statment we invoke a fruit name which is not contained in the Set variable.
  fruit("potato")                                 //> res1: Boolean = false
  
  // Now let's create a set with duplicate values.
  val num = Set(1,3,2,2,1,5,3)                    //> num  : scala.collection.immutable.Set[Int] = Set(1, 3, 2, 5)
  // You will find that the output of the statement does not contain those duplicate entries.
  // We can also add values to an existing set. However the placement of the element is not going to be at the last entry in the set.
  num += 6
  print(num)
  
  
}
