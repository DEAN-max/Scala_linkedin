object Special_Functions2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
    ((x: Int) => x + 1)(5)                        //> res0: Int = 6
    // The above statement represents an anonymous function which will add 1 to the value of x.
    // It could be invoked in 2 ways first we can enclose the entire function in another set of  parenthesis with a value
    // Another way of invoking anonymous function is to assign into a variable.
  val f = (x: Int) => x + 1                       //> f  : Int => Int = Special_Functions2$$$Lambda$12/0x0000000800c20040@3224f60b
                                                  //| 
  f(5)                                            //> res1: Int = 6
  // When we follow this approach it internally invokes apply()
  f.apply(3)
}
