object CallBy{
  def something() = {
    println("Inside caling something")
    5 // return value. The value 5 is the return value of the function something(). In scala the last value is the return value
  }

  def callByValue(x: Int) = {
    println("Call By Value: ")
    println("x1 = " + x)
    println("x2 = " + x)
  }

  callByValue(something())  // First something() will be called which returns a value 5. Post that the callByValue() will be invoked with the value 5 as an argument.

  def callByName(x: => Int) = {  // Here we have used '=>' which signifies that this function is for callByName purpose.
    println("Call by name: ")
    println("x1 = " + x)
    println("x2 = " + x)
  }
  // The difference with callByValue is it will get the value of input everytime the imput parameter is used.
  // So in the first println statement it will go back to something() for fetching the input value.
  // Again in the next line with the other println it will agin go back to something() for fetching the input value.
  
  callNyName(something()) 
}
