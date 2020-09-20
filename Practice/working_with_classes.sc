package Practice

object working_with_class extends App {
  // Creating objects.
  var e1 = new Employees("Paul", "Walker")
  var e2 = new Employees("Winch", "Dench", 'y')

  println(e1)
  println(e2)
}

class Employees(val firstname: String, val lastname: String, var salaried: Char = 'n'){
  def fullname: String = firstname + lastname

  override def toString = "Employee name: " + fullname +
    (if(salaried == 'n') "\nHourly employee" else "\nMonthly employee") +
    ("\n" + " = " * 20) // This will print = 20 times which will act as a line separator.
}

/*  Output:
Employee name: PaulWalker
Hourly employee
 =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  = 
Employee name: WinchDench
Monthly employee
 =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  = 
*/
