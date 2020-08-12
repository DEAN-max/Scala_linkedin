object Average {
 // println("Welcome to the Scala worksheet")
 var grades = List(100, 99, 75, 67, 89, 85, 92, 93, 60, 97)
                                                  //> grades  : List[Int] = List(100, 99, 75, 67, 89, 85, 92, 93, 60, 97)
 var sum = 0                                      //> sum  : Int = 0
 var count = 0                                    //> count  : Int = 0
 
 for(g <- grades){
 	if(g > 92)
 		println("Grade is A.")
 		
 	else if(g > 85)
 		println("Grade is B.")
 		
 	else if(g > 76)
 		println("Grade is C.")
 		
 	else if(g > 68)
 		println("Grade is D.")
 		
 	else
 		println("Grade is F.")
 // Average calculation.
 sum += g
 count += 1
 	}                                         //> Grade is A.
                                                  //| Grade is A.
                                                  //| Grade is D.
                                                  //| Grade is F.
                                                  //| Grade is B.
                                                  //| Grade is C.
                                                  //| Grade is B.
                                                  //| Grade is A.
                                                  //| Grade is F.
                                                  //| Grade is A.
 	
 	println("Average value is: " + (sum / count))
                                                  //> Average value is: 85
}

// Alternate solution.

object challenge {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var grades = List(100, 99, 75, 67, 89, 85, 92, 93, 60, 97)
                                                  //> grades  : List[Int] = List(100, 99, 75, 67, 89, 85, 92, 93, 60, 97)
  for(g <- grades) if(g > 92) println("A")
  else if (g > 85) println("B")
  else if (g > 76) println("C")
  else if (g > 68) println("D")
  else println("F")                               //> A
                                                  //| A
                                                  //| D
                                                  //| F
                                                  //| B
                                                  //| C
                                                  //| B
                                                  //| A
                                                  //| F
                                                  //| A
  var count:Double = 0.0                          //> count  : Double = 0.0
  for(g <- grades) count=count+1
// foldLeft helps to add next values to the first item.
  val sum = grades.foldLeft(0.0)(_+_)             //> sum  : Double = 857.0
  def avg(c:Double):Double = { sum/c }            //> avg: (c: Double)Double
  println(avg(count))                             //> 85.7
  
  
                                                  
 
 		
 	
 
  
}
