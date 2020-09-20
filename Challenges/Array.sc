/*
Problem Statement - 
create function to find the average of an array of numbers.
write function to find min and max of an array.

create array of 10 values.
Print out results of average, sum, min and max.
*/

package Practice

object array_assignment extends App {
  var num = Array(10, 20, 30)
  
  def avg(num: Array[Int]): Int = {
    var element = 0
    var count = 0

    for(n <- num){
      element += n
      count += 1
    }
    element = element / count
    element
  }

  println(avg(num))
}
// 20
