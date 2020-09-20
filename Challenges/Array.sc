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

  def min(num :Array[Int]): Int = {num. min}
  def max(num :Array[Int]): Int = {num. max}

  println("Average: " + avg(num))
  println("Min: " + min(num))
  println("Max: " + max(num))

  val arr = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

  println("Second array list.")
  println("Average: " + avg(arr) + " ; Min: " + arr.min + " ; Max: " + arr.max + " ; Sum: " + arr.sum)
}
/*
Average: 20
Min: 10
Max: 30
Second array list.
Average: 4 ; Min: 0 ; Max: 9 ; Sum: 45
*/
