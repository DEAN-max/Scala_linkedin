object computer {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

//lists can be made up of objects
class Computer(val make:String, val model:String, val ram:String){
	override def toString:String = ("["+make + ", "+model + ", "+ ram+"]\n")

}
val computers = List(new Computer("Dell", "Laptop", "16GB"),
	new Computer("Dell", "Desktop", "32GB"),
	new Computer("Mac","Mini", "8GB"),
	new Computer("HP", "Notebook", "16GB"))   //> computers  : List[computer.Computer] = List([Dell, Laptop, 16GB]
                                                  //| , [Dell, Desktop, 32GB]
                                                  //| , [Mac, Mini, 8GB]
                                                  //| , [HP, Notebook, 16GB]
                                                  //| )

//use first to get first element in list
val first = computers.head                        //> first  : computer.Computer = [Dell, Laptop, 16GB]
                                                  //| 

//use tail to get everything except the first element
val rest = computers.tail                         //> rest  : List[computer.Computer] = List([Dell, Desktop, 32GB]
                                                  //| , [Mac, Mini, 8GB]
                                                  //| , [HP, Notebook, 16GB]
                                                  //| )
}