package Practice

import java.io._
import io.Source._

object exception_handling extends App{
  try {
    for(line <- fromFile("nofile.txt").getLines())
      println(line)
  }
  catch {
    case e:FileNotFoundException => println("File was not found.")  // This will be the output.
    case _:Exception => println("Program has an error.")            // This is to catch any exception.
  }
    // Exception handling to catch divide by zero.
  try{
    var quo = 10 / 0
  }
  catch{
    case e:ArithmeticException => println("Divide by 0 exception")
  }
}
