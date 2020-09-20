package Practice

object singleton_object extends App {
  // Creating objects.
  var e1 = new Employees("Paul", "Walker")
  var e2 = new Employees("Winch", "Dench", 'y')

  println(e1)
  println(e2)
}

class Employees(val firstname: String, val lastname: String, var salaried: Char = 'n'){
  def fullname: String = firstname + lastname

  override def toString = "Employee name: " + fullname + "Emp id: " + Empid.generateEmpid() +
    (if(salaried == 'n') "\nHourly employee" else "\nMonthly employee") +
    ("\n" + " = " * 20) // This will print = 20 times which will act as a line separator.
}

object Empid{           // Singleton object.
  var eid = 0
  def generateEmpid() = {
    eid += 1
    eid
  }
}
/*
Employee name: PaulWalkerEmp id: 1
Hourly employee
 =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  = 
Employee name: WinchDenchEmp id: 2
Monthly employee
 =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  = 
*/
