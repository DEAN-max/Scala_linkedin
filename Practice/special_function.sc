object CallBy{
  def something() = {
    println("Inside caling something")
    5 // return value
  }

  def callByValue(x: Int) = {
    println("Call By Value: ")
    println("x1 = " + x)
    println("x2 = " + x)
  }

  callByValue(something())

  def callByName(x: => Int) = {
    println("Call by name: ")
    println("x1 = " + x)
    println("x2 = " + x)
  }
  
  callNyName(something()) 
}
