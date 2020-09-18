package Practice

import io.Source._

object read_file extends App {
  val filename = "D:\\Programs\\Intellij_worksheet\\src\\Practice\\rainbow.txt"

  for(file <- fromFile(filename).getLines()) println(file)

  val flist = fromFile("D:\\Programs\\Intellij_worksheet\\src\\Practice\\rainbow.txt").getLines().toList

  flist.foreach(println)
}
