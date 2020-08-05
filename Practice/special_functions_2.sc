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
  f.apply(3)                                      //> res2: Int = 4
  // As it is clearly visible that using apply() also yeilds the same result.
  // We can also assign an anonymous function to a variable
  val doubler = (i: Int) => (i * 2)               //> doubler  : Int => Int = Special_Functions2$$$Lambda$13/0x0000000800c21040@1e
                                                  //| fed156
  doubler(3)                                      //> res3: Int = 6
  
  // Scala also supports higher order function or nested function.
  
  def someOperation(f: (Int, Int) => Int){
    println(f(5, 5))
  }                                               //> someOperation: (f: (Int, Int) => Int)Unit
  // Here the above is an higher order function with no return value.
  val add = (x: Int, y: Int) => x + y             //> add  : (Int, Int) => Int = Special_Functions2$$$Lambda$14/0x0000000800c21840
  // add is an anonymous function which uses call by name.
  someOperation(add)                              //> 10
  
  // Another example where we would see where a function is returned.
  
  def greeting() = (name: String) => {
    "Hello " + name
  }                                              //> greeting: ()String => String
  
  val g = greeting()                          //> g  : String => String = Special_Functions2$$$Lambda$15/0x0000000800c22840@5a
                                                 //| 8806ef
  g("Peggy")                                    //> res4: String = Hello Peggy
  
 // Finally we will look into closure function. Parameters could be used inside closure function which are not passed into that function.
  var y = 5
  val multiplier = (x: Int) => x * y
  multiplier(4)
  
}
