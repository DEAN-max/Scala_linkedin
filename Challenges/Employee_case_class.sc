object Employee {
  case class Employee(id: Int, fname: String, lname: String){      // The variable type is declared as val by default.
  	override def toString: String = ("Employee Id: " + id + "\nFull Name: " + fname + " " + lname)
  	}
  	
  	var details = List(Employee(111, "Sam", "Keith"),
  	Employee(112, "Gary", "Farman"),
  	Employee(113, "Vincent", "L")
  	)                                         //> details  : List[Employee.Employee] = List(Employee Id: 111
                                                  //| Full Name: Sam Keith, Employee Id: 112
                                                  //| Full Name: Gary Farman, Employee Id: 113
                                                  //| Full Name: Vincent L)
  	
  	details.foreach(println)                  //> Employee Id: 111
                                                  //| Full Name: Sam Keith
                                                  //| Employee Id: 112
                                                  //| Full Name: Gary Farman
                                                  //| Employee Id: 113
                                                  //| Full Name: Vincent L
  	
  	var new_details = Employee(22, "Brad", "Colt")
                                                  //> new_details  : Employee.Employee = Employee Id: 22
                                                  //| Full Name: Brad Colt
  	
  	println(new_details. fname)               //> Brad
    // In the above statement we can see that in a case class any variable value can be accessed randomly
}
