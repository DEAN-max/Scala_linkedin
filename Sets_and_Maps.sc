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
  
  num.contains(5)				  // Check whether s1 set has the element 5
// val res2: Boolean = false
  num(5)						  // Similar check so 'contains' method is not mandatory.
// val res3: Boolean = false
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
  // This is called intersection
  
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
  // Removing element from a set.
var nums = Set(3, 2, 2, 8)
// var nums: scala.collection.immutable.Set[Int] = Set(3, 2, 8)

nums -= 8

scala> nums
// val res5: scala.collection.immutable.Set[Int] = Set(3, 2)
	
  // Let's talk about maps now. Below statement declares a map.
  var g = Map(1 -> "Novice", 2 -> "Amature", 3 -> "Intermediate", 4 -> "Pro")
                                                  //> g  : scala.collection.immutable.Map[Int,String] = Map(1 -> Novice, 2 -> Amatu
                                                  //| re, 3 -> Intermediate, 4 -> Pro)
  // Accessing value of a map.
  g(2)                                            //> res0: String = Amature
  // Adding new value to a map.
  g = g + (5 -> "Expert")
  println(g)                                      //> Map(5 -> Expert, 1 -> Novice, 2 -> Amature, 3 -> Intermediate, 4 -> Pro)
  // If we are trying to access an element which does not exist in the map then we get an error.
  g(6)                                            //> java.util.NoSuchElementException: key not found: 6
                                                  //| 	at scala.collection.MapLike.default(MapLike.scala:232)
                                                  //| 	at scala.collection.MapLike.default$(MapLike.scala:231)
                                                  //| 	at scala.collection.AbstractMap.default(Map.scala:59)
                                                  //| 	at scala.collection.MapLike.apply(MapLike.scala:141)
                                                  //| 	at scala.collection.MapLike.apply$(MapLike.scala:140)
                                                  //| 	at scala.collection.AbstractMap.apply(Map.scala:59)
                                                  //| 	at Maps$.$anonfun$main$1(Maps.scala:6)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$anonfun$$ex
                                                  //| ecute$1(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:76)
                                                  //| 	at Maps$.main(Maps.scala:1)
                                                  //| 	at Maps.main(Maps.scala)
  // However, if we use get method then no error shows up.
  g.get(6)                                        //> res1: Option[String] = None	
  // In scala we can also print out a message when the map element we are trying to access does not exist.
  g.getOrElse(6, "Element does not exist")        //> res2: String = Element does not exist
	
  var groceries = Map(1 -> "Milk", 2 -> "Sugar", 3 -> "Grains", 4 -> "Hazel nut")
// var groceries: scala.collection.immutable.Map[Int,String] = Map(1 -> Milk, 2 -> Sugar, 3 -> Grains, 4 -> Hazel nut)

  for(v <- groceries.values) println(v)
// Remember that values are added using a hash table hence their order might be different when printed.
/*
Milk
Sugar
Grains
Hazel nut
*/
// We can also print the values in the reverse order values followed by keys.

var z = for((k, v) <- groceries) yeild(v, k)
// var z: scala.collection.immutable.Map[String,Int] = Map(Milk -> 1, Sugar -> 2, Grains -> 3, Hazel nut -> 4)
z.foreach(println)
/*
(Milk,1)
(Sugar,2)
(Grains,3)
(Hazel nut,4)
*/
