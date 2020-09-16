object Functions {
  val x = println(2)                              //> 2
                                                  //| x  : Unit = ()
  def printHello(i: String) = "Hello" + i         //> printHello: (i: String)String
  printHello("Dean")                              //> res0: String = HelloDean
  
  // For using a single if else statement inside a for loop braces are not mandatory.
  def abs(x:Int):Int = if(x < 0) -x else x
  print(abs(-21))
  
  // Factorial calculation using function.
  def fact(n:Int) = {  // Note that the return type has not been explicitly mentioned in this case the compiler automatically adds the return type. Otherwise we may choose to mention the return type which will also yeild the sane result.
  	var r = 1
  	for(i <- 1 to n)
  		r = r * i       // This statement could also be rewritten in short hand form like r *= i
  		r               // Note: This is the return statement which would always contain the variable name not any expression.
    // Hence the computation inside the for loop has been broken down into 2 statements instead of one.
    }                               
  print(fact(5))
}
