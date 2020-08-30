object specialFunctions {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  ((x:Int) => x+1)(5)                             //> res0: Int = 6
  val f = (x:Int)=>x+1                            //> f  : Int => Int = <function1>
  f(5)                                            //> res1: Int = 6
  f.apply(3)                                      //> res2: Int = 4
  val doubler = (i:Int)=>{i*2}                    //> doubler  : Int => Int = <function1>
  doubler(6)                                      //> res3: Int = 12
  def someOperation(f:(Int, Int)=>Int){
  println(f(5,5))}                                //> someOperation: (f: (Int, Int) => Int)Unit
  val add = (x:Int, y:Int) => x+y                 //> add  : (Int, Int) => Int = <function2>
  someOperation(add)                              //> 10
  def greeting() = (name:String)=>{"Hello " +
  name}                                           //> greeting: ()String => String
  val g = greeting()                              //> g  : String => String = <function1>
  g("Peggy")                                      //> res4: String = Hello Peggy
  var y = 5                                       //> y  : Int = 5
  val multiplier = (x:Int) => x*y                 //> multiplier  : Int => Int = <function1>
  multiplier(4)                                   //> res5: Int = 20
  
}