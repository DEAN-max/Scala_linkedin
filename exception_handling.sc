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
}
