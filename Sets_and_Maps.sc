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
  print(num)                                      //> Set(5, 1, 6, 2, 3)
  
  if(num.isEmpty) println("Set is empty")
  
  else println("Value of the first set element is " + num.head)
                                                  //> Value of the first set element is 5
  println("Rest of the set elements: " + num.tail)//> Rest of the set elements: Set(1, 6, 2, 3)
  
  // Now let's combine 2 different sets together.
  var s1 = Set(21, 12, 23, 32, 43, 34)            //> s1  : scala.collection.immutable.Set[Int] = Set(21, 32, 34, 12, 43, 23)
  var s2 = Set("Twenty one", "Twelve", "Twenty three", ".....")
                                                  //> s2  : scala.collection.immutable.Set[String] = Set(Twenty one, Twelve, Twent
                                                  //| y three, .....)
  
  s1 ++ s2                                        //> res2: scala.collection.immutable.Set[Any] = Set(Twelve, 21, Twenty one, 32, 
                                                  //| 34, 12, 43, Twenty three, ....., 23)
  // This will also get rid of the duplicate elements. It could also be observed that the data type has changed to Any type.
  // Last command we will try out is to check whether there are any overlappings present or not between 2 sets.
  
  val x1 = Set(1, 2, 3)                     //> x1  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)
	var x2 = Set(1, 2, 3)                     //> x2  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)
	
	x1.&(x2)                                  //> res3: scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  
  // x1 and x2 containing different values.
  
  val x1 = Set(1, 2, 3)                     //> x1  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)
	var x2 = Set(1, 2)                        //> x2  : scala.collection.immutable.Set[Int] = Set(1, 2)
	
	x1.&(x2)                                  //> res3: scala.collection.immutable.Set[Int] = Set(1, 2)
  
  	val x1 = Set(1, 2, 3)                     //> x1  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)
	var x2 = Set(1, 2, 3, 4)                  //> x2  : scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)
	
	x1.&(x2)                                  //> res3: scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  
  // No matter what is the order of x1.&(x2) is, it will always filter out the common elements. The is not only applicable for numberic datasets but also datasets having combination of different datatypes.
  
  
}
