package Practice

import io.Source._

object read_file extends App {
  val filename = "D:\\Programs\\Intellij_worksheet\\src\\Practice\\rainbow.txt"

  for(file <- fromFile(filename).getLines()) println(file)    // getLines() method retrieves each line from the file.

  val flist = fromFile("D:\\Programs\\Intellij_worksheet\\src\\Practice\\rainbow.txt").getLines().toList  // Converts each line into a list element

  flist.foreach(println)
}

// To write into a file java method has to be used.
