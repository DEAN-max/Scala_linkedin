object employee {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  case class Employee(lName:String, fName:String, ID: Int) {
  override def toString:String = {
  "Employee ID: "+ID+"\nFull Name: " +fName + " " +lName }
  }
  
  var ees = List(Employee("Smith", "John", 12345), Employee("Fisher", "Peggy", 54321),
  Employee("Simpson", "Scott", 12346))            //> ees  : List[employee.Employee] = List(Employee ID: 12345
                                                  //| Full Name: John Smith, Employee ID: 54321
                                                  //| Full Name: Peggy Fisher, Employee ID: 12346
                                                  //| Full Name: Scott Simpson)
  
  ees.foreach(println)                            //> Employee ID: 12345
  
 	var ee1 = Employee("Rogers", "Samantha", 12334)
 	println(ee1.lName)
                                                  //| Full Name: John Smith
                                                  //| Employee ID: 54321
                                                  //| Full Name: Peggy Fisher
                                                  //| Employee ID: 12346
                                                  //| Full Name: Scott Simpson
                                               
}