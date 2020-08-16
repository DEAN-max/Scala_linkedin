object Tuple {
	val tuple = (1, false, "str")                    //> tuple  : (Int, Boolean, String) = (1,false,str)
	// Next way to create tuple is by using ordered key pair.
	val tuple2 = "computer" -> "Acer Predator"       //> tuple2  : (String, String) = (computer,Acer Predator)
	// In the above statement '->' is called a relation operator.
	
	// Accessing the tuple value via index.
	val second = tuple2._2                           //> second  : String = Acer Predator
	// In the above statement we are fetching the value of the second element.
	// Note: Tuples start with index value 1 unlike arrays and lists.
	
}
