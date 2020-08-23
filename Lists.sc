object Lists {
  // Below statement creates an empty list.
	val empty: List[Nothing] = List()         //> empty  : List[Nothing] = List()
	var a = List(3.0, "Hello")                //> a  : List[Any] = List(3.0, Hello)
	var x1 = List(1, 2, 3, 4, 5, 6)           //> x1  : List[Int] = List(1, 2, 3, 4, 5, 6)
// In the below example using cons operator Scala is creating a list consisting of head element as 1 and the rest of the tail element is appended to the head.
	var x2 = 1::2::3::4::5::6::Nil            //> x2  : List[Int] = List(1, 2, 3, 4, 5, 6)
}
