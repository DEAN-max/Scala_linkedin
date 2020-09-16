// Function variable.
val double = (i: Int) => i * 2
// double: Int => Int = $$Lambda$875/0x000000084056d840@585513a8

def higherOrder(x: Int, y: Int => Int) = y(x)
// higherOrder: (x: Int, y: Int => Int)Int

higherOrder(5, double)
// res3: Int = 10
