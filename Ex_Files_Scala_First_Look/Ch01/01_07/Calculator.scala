object Calculator {

    def main(args:Array[String]) {
        val x = 10
        val y = 5
        println(addition(x,y))
        println(quotient(x,y))
        println(times(x,y))
        println(minus(x,y))

    }
    def addition(a:Int, b:Int) = a + b
	def quotient(a:Int, b:Int) = if(b == 0) 0 else a / b
	def times(c:Int, d:Int) = c * d
	def minus(a:Int, b:Int) = a - b
    
}
