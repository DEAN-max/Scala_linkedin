object Functions {
val x = println(2)                                //> 2
                                                  //| x  : Unit = ()
def printHello(i:String) = "Hello "+i             //> printHello: (i: String)String
printHello("Peggy")                               //> res0: String = Hello Peggy
def Hello = {"Hello World!"}                      //> Hello: => String
Hello                                             //> res1: String = Hello World!
def add(x:Int, y:Int):Int = x + y                 //> add: (x: Int, y: Int)Int
add(8,7)                                          //> res2: Int = 15
}