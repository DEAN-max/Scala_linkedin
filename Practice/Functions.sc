object Functions {
  val x = println(2)                              //> 2
                                                  //| x  : Unit = ()
  def printHello(i: String) = "Hello" + i         //> printHello: (i: String)String
  printHello("Dean")                              //> res0: String = HelloDean
  
  // For using a single if else statement inside a for loop braces are not mandatory.
  def abs(x:Int):Int = if(x < 0) -x else x
  print(abs(-21))
}
