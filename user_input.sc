package Practice  // package statement should be at the top always.
import io.StdIn._
//package Practice

object user_input extends App {
  var done = false

  while(!done){
    val std_name = readLine("Enter student name: ")   // As we have imported 'io.StdIn._' , we can use readLine directly.
    println("Enter marks scored: ")
    var score = readDouble()
    println("You have scored: " + (if(score >= 80) 'A'
    else if(score >= 60) 'B'
    else if(score >= 40) 'C'
    else 'F'))
    println("If you wish to add another entry enter 'true' else type 'false': ")
    done = !readBoolean()
  }
}
