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
}
