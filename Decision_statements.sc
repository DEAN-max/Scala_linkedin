object Decision_Statement {
  var hoursWorked = 40
  var rate = 10
  
  def earnings(h: Double): Double = {
  	if(h <= 40)
  		h * rate
  	else
  		(h - 40) * rate + 40 * rate
  }
  // Note that in the above if else statements there are no variables used to store the results. It directly sends the return value.
  // Another point to note is that "rate" variable is not passed as a function parameter but the earnings method can still access it. 
  
  println("$" + earnings(hoursWorked) + "earned for working " + hoursWorked + " hours")
  println("$" + earnings(30) + "earned for working 30 hours")
  println("$" + earnings(45) + "earned for working 45 hours")
  
  // Nested if else
  var x = 0
  
  if(x < 0)
  	println("Negetive number.")
  else if(x == 0)
  	println("Zero number.")
  else
  	println("Positive number.")
  	
  // Working with case statements.
  val day1 = "FRI"
  val day2 = "SUN"
  val day3 = "AAA"
  
  
  
}
