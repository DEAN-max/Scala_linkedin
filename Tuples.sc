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
	
	// Assigning values to multiple variables same time.
	al v = (1, 55.22, "Third")
  	val(first, second, third) = v
	
	//Using tuples as a function.
	def divide(n: Int): Tuple2[Int, Int] = (n / 10, n% 10)
                                                  //> divide: (n: Int)(Int, Int)
	
	val (tens, ones) = divide(54)             //> tens  : Int = 5
                                                  //| ones  : Int = 4
	
	println("Tens " + tens)                   //> Tens 5
	println("Ones " + ones)                   //> Ones 4
	
	// Using Zip method to combine values of 2 different arrays.
	
	val symbol = Array('<', '-', '=')
	val count = Array(2, 10, 2)
	val pairs = symbol.zip(count)
	// val pairs: Array[(Char, Int)] = Array((<,2), (-,10), (=,2))
	for((s, n) <- pairs) print(s * n)
//      120450122
	
	// Next we will perform the same task but this time will use double quotes instead of single inside Array elements.
	val symbols = Array("<", "-", ">")              //> symbols  : Array[String] = Array(<, -, >)
  	val counts = Array(2,10,2)                      //> counts  : Array[Int] = Array(2, 10, 2)
  	val pairs = symbols.zip(counts)                 //> pairs  : Array[(String, Int)] = Array((<,2), (-,10), (>,2))
  	for((s,n)<- pairs)print(s*n)                    //> <<---------->>
	// Closely notice the difference in datatype when single quotes is used, it forms a Char type.
	// However, when double quotes is used, it forms a String type.
}
