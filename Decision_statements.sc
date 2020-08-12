object Decision_Statement {
  var hoursWorked = 40                            //> hoursWorked  : Int = 40
  var rate = 10                                   //> rate  : Int = 10
  
  def earnings(h: Double): Double = {
  	if(h <= 40)
  		h * rate
  	else
  		(h - 40) * rate + 40 * rate
  }                                               //> earnings: (h: Double)Double
  // Note that in the above if else statements there are no variables used to store the results. It directly sends the return value.
  // Another point to note is that "rate" variable is not passed as a function parameter but the earnings method can still access it.
  
  println("$" + earnings(hoursWorked) + "earned for working " + hoursWorked + " hours")
                                                  //> $400.0earned for working 40 hours
  println("$" + earnings(30) + "earned for working 30 hours")
                                                  //> $300.0earned for working 30 hours
  println("$" + earnings(45) + "earned for working 45 hours")
                                                  //> $450.0earned for working 45 hours
  
  // Nested if else
  var x = 0                                       //> x  : Int = 0
  
  if(x < 0)
  	println("Negetive number.")
  else if(x == 0)
  	println("Zero number.")
  else
  	println("Positive number.")               //> Zero number.
  	
  // Working with case statements.
  val day1 = "FRI"                                //> day1  : String = FRI
  val day2 = "SUN"                                //> day2  : String = SUN
  val day3 = "AAA"                                //> day3  : String = AAA
  
  val result = day1 match{
  	case "MON" | "TUE" | "WED" | "THU" | "FRI" => "weekday"
  	case "SAT" | "SUN" => "weekend"
  	case _ => "INVALID"
  	}                                         //> result  : String = weekday
  println(result)                                 //> weekday
}
