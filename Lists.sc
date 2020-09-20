object Lists {
  // Below statement creates an empty list.
	val empty: List[Nothing] = List()         //> empty  : List[Nothing] = List()
	var a = List(3.0, "Hello")                //> a  : List[Any] = List(3.0, Hello)
	var x1 = List(1, 2, 3, 4, 5, 6)           //> x1  : List[Int] = List(1, 2, 3, 4, 5, 6)
// In the below example using cons operator Scala is creating a list consisting of head element as 1 and the rest of the tail element is appended to the head.
	var x2 = 1::2::3::4::5::6::Nil            //> x2  : List[Int] = List(1, 2, 3, 4, 5, 6)
	// We can use range method with list to create a list with a range of values.
	var x3 = List. range(10, 20)              //> x3  : List[Int] = List(10, 11, 12, 13, 14, 15, 16, 17, 18, 19)
	// We can also mention the steps in a range function.
	var x4 = List. range(3, 21, 3)            //> x4  : List[Int] = List(3, 6, 9, 12, 15, 18)
	// Remember that this does not include the last element of the list.
	// Merging lists using :::
	var x5 = x1:::x2:::x3                     //> x5  : List[Int] = List(1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 10, 11, 12, 13, 1
                                                  //| 4, 15, 16, 17, 18, 19)
	// Just like this operator, we can also use the concat operator to concat values of lists.
	var x5 = x1:::x2:::x3                     //> x5  : List[Int] = List(1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 10, 11, 12, 13, 1
                                                  //| 4, 15, 16, 17, 18, 19)
	// Printing all the elements using a foreach loop. Syntax is list_name.foreach().
	x1.foreach(println)                       //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
  
  	var sum = 0                               //> sum  : Int = 0
  	// This will calculate the sum of all the elements in the list. Here '_' denotes to include all elements. The tail elements are added with the head element.
  	x1.foreach(sum += _)
  
  	println(sum)                              //> 21
	// Next will print a List containing only string values.
	var language = List("C", "C++", "Java", "Scala", "Python")
                                                  //> language  : List[String] = List(C, C++, Java, Scala, Python)
  
  	for(lan <- language) println(lan)         //> C
                                                  //| C++
                                                  //| Java
                                                  //| Scala
                                                  //| Python
	// Using map function to modify values in a list. This is really a very handy function.
	// The below map function modifies the list elements by multipling by 2.
	var z = x3.map(_ * 2)                     //> z  : List[Int] = List(20, 22, 24, 26, 28, 30, 32, 34, 36, 38)
	// Creating list of lists.
	
	val list = List((1, 2), (2, 3), (4, 5))
// val list: List[(Int, Int)] = List((1,2), (2,3), (4,5))
	
	for((a, b) <- list) yield a + b          // Adding values of each sub list elements and forming a new list.
// val res11: List[Int] = List(3, 5, 9)
}
