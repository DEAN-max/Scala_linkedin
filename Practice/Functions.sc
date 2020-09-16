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
  
  // Factorial using recursion.
  def facto(n: Int): Int = if(n == 0) 1 else n * facto(n - 1)
// facto: (n: Int)Int
  facto(6)
// res1: Int = 720
  
  // We can also initialize values at the time of function calling.
  def name(fname: String, lname: String) = print(fname + " " + lname)
  name(fname = "Carol", lname = "Denver")
  // Interestingly even if we happen to change the order at the time of function call, the final result remains to be the same.
  //name(lname = "Denver", fname = "Carol") --> This will also yeild the same result.
  
  // We can even use default values in our function.
  def name(right: String = "[ ", fname: String, lname: String, left: String = " ]") = print(right + fname + " " + lname + left)
//name: (right: String, fname: String, lname: String, left: String)Unit

name(lname = "Denver", fname = "Carol")
  //[ Carol Denver ]
  // Note that the values inside the variables are required to be initialized either at the time of function call or inside the function parameters.
  
}
