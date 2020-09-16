// Function variable.
val double = (i: Int) => i * 2                  // This function will just multiply by 2. 
// double: Int => Int = $$Lambda$875/0x000000084056d840@585513a8

def higherOrder(x: Int, y: Int => Int) = y(x)   // First parameter is an integer number and the second one is a function that takes an int and returns an integer value as well.
// Inside the function body the function is called by passing the value to it.
// higherOrder: (x: Int, y: Int => Int)Int

higherOrder(5, double)                          // We are passing the value and the function name as both arguments.
// res3: Int = 10
