// Function variable.
val double = (i: Int) => i * 2                  // This function will just multiply by 2. 
// double: Int => Int = $$Lambda$875/0x000000084056d840@585513a8

def higherOrder(x: Int, y: Int => Int) = y(x)   // First parameter is an integer number and the second one is a function that takes an int and returns an integer value as well.
// Inside the function body the function is called by passing the value to it.
// higherOrder: (x: Int, y: Int => Int)Int

higherOrder(5, double)                          // We are passing the value and the function name as both arguments.
// res3: Int = 10

// Once the higher order function is built, it could easily be reused in any favourable way.
val triple = (i: Int) => i * 3
// triple: Int => Int = $$Lambda$880/0x0000000840571040@26c59348

higherOrder(5, triple)
// res4: Int = 15

// Function returns another function.
val sayHello = (name: String) => {"Hello " + name}
// sayHello: String => String = $$Lambda$883/0x0000000840573840@745cf754

sayHello("Dean")
// res5: String = Hello Dean

// This can also be stored into a string.
val greeting = sayHello("Dean")
// greeting: String = Hello Dean

// Closures - It is a function whose return value depends on the value of the variable declared outside of that function.
val y = 5
// y: Int = 5

val multiplier = (x: Int) => x * y
// multiplier: Int => Int = $$Lambda$902/0x0000000840581040@4ac26092

multiplier(20)
// res7: Int = 100

