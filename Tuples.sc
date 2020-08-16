object Tuple {
	val tuple = (1, false, "str")                    //> tuple  : (Int, Boolean, String) = (1,false,str)
	// Next way to create tuple is by using ordered key pair.
	val tuple2 = "computer" -> "Acer Predator"       //> tuple2  : (String, String) = (computer,Acer Predator)
	// In the above statement '->' is called a relation operator.
	
	// Accessing the tuple value via index.
	val second = tuple2._2                           //> second  : String = Acer Predator
	// In the above statement we are fetching the value of the second element.
	// Note: Tuples start with index value 1 unlike arrays and lists.
	// Another way of declaring a tuple.
	val tup = "a" -> 25				//> tup  : (String, Int) = (a,25)
	
	//Using tuples as a function.
	def divide(n: Int): Tuple2[Int, Int] = (n / 10, n% 10)
                                                  //> divide: (n: Int)(Int, Int)
	
	val (tens, ones) = divide(54)             //> tens  : Int = 5
                                                  //| ones  : Int = 4
	
	println("Tens " + tens)                   //> Tens 5
	println("Ones " + ones)                   //> Ones 4
	
}
