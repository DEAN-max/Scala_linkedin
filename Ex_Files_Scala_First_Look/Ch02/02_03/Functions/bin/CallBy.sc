object CallBy {
    def something() = {
  println("inside calling something")
  5 // return value
}                                                 //> something: ()Int
def callByValue(x: Int) = {
	println("call by value: ")
  println("x1 = " + x)
  println("x2 = " + x)
}                                                 //> callByValue: (x: Int)Unit
callByValue(something())                          //> inside calling something
                                                  //| call by value: 
                                                  //| x1 = 5
                                                  //| x2 = 5
def callByName(x: => Int) = {
	println("call by name: ")
  println("x1 = " + x)
  println("x2 = " + x)
}                                                 //> callByName: (x: => Int)Unit
callByName(something())                           //> call by name: 
                                                  //| inside calling something
                                                  //| x1 = 5
                                                  //| inside calling something
                                                  //| x2 = 5

}