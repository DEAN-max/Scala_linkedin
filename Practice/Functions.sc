object Functions {
  val x = println(2)                              //> 2
                                                  //| x  : Unit = ()
  def printHello(i: String) = "Hello" + i         //> printHello: (i: String)String
  printHello("Dean")                              //> res0: String = HelloDean
}
