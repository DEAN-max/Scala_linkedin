object SyntaxExample {
  def main(args: Array[String]) {
  	val car:String = "Mustang"
  	val Car = "Prius"

  	/* Java code to create an arraylist with 3 numbers:
  	List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		for(Integer n:numbers){
			System.out.println("Num: "+n);}
	*/
	//Scala code for same problem: 
  	val numbers = List(1,2,3)
	for(n <- numbers) println("num:" + n)  //the n <- numbers is called a generator expression

	for(i <- 10 to 1 by -1) print(i + ",")
	println("Blastoff!")
	}
	}
