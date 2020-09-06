var i = 5
while (i >= 0) {
    print(i+",")
    // Decrement.
    i -= 1
}
//println

// Output - 5,4,3,2,1,0,

val fruit = List("apples", "bananas", "cherries", "pears", "blueberries")
for(f <- fruit)
println(f)

/*
Output - 
apples
bananas
cherries
pears
blueberries
*/

//print fruit starting with 'c', use filtering
for(f <- fruit if(f.startsWith("c")))
println("fruits starting with c: " + f)

// Output - fruits starting with c: cherries

//nested for loop 
for (i <- 1 to 5 ;
	j <- 1 to 5)
print(i * j + ",")
println

/*Output - 1,2,3,4,5,2,4,6,8,10,3,6,9,12,15,4,8,12,16,20,5,10,15,20,25,*/

//for each even number between 1 and 10, square it, expected result: 4,16,36,64,100
for ( n <- 1 to 10 ; e = n % 2; if e==0 ) yield n * n

// val res6: IndexedSeq[Int] = Vector(4, 16, 36, 64, 100)
// Note that the above yeild statement is rewritten as below without using the assignment operator, then it gets a syntax error.
/*
for ( n <- 1 to 10 ; n % 2 == 0 ) yield n * n
HelloWorld.scala:4: error: '<-' expected but ')' found.
      for ( n <- 1 to 10 ; n % 2 == 0 ) yield n * n
                                      ^
HelloWorld.scala:6: error: illegal start of simple expression
   }
   ^
two errors found
*/

//sum each pair of numbers, expected result: 3,7,11
val list = List((1,2),(3,4),(5,6))

//val list: List[(Int, Int)] = List((1,2), (3,4), (5,6))

for ( (a,b) <- list) yield a + b

// val res7: List[Int] = List(3, 7, 11)

//create a vector of numbered pairs
for ( x <- 0 to 4 ; y <- 0 until 3) yield (x,y)

/* val res8: IndexedSeq[(Int, Int)] = Vector((0,0), (0,1), (0,2), (1,0), (1,1), (1,2), (2,0), (2,1), (2,2), (3,0), (3,1), (3,2), (4,0), (4,1), (4,2)) */

import scala.io.StdIn.{readLine,readInt}
var choice = 0
var result = ""
do{
	println("\nChoose one: \n1. Java\n2. Scala\n3. C++\n4. Exit")
	choice = readInt
	result = choice match {
	case 1 => "You chose Java"
	case 2 => "You chose Scala"
	case 3 => "You chose C++"
	case 4 => "You chose Exit"
	case _ => "Invalid choice, try again"
	}
println(result)
}while(choice != 1 && choice != 2 && choice != 3 && choice != 4 )

/*A do while loop is used as the user should be shown the menu atleast once irrespective of the choice that he/she chooses to make.*/
