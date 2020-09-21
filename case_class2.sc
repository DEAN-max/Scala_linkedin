package Practice

object case_class2 extends App{
  val alice = Person("Alice", 25)
  val roddick = Person("Roddick", 54)
  val bruce = Person("Bruce", 20)

  for(person <- List(alice, roddick, bruce)){
    person match{
      case Person("Alice", 25) => println("Alice in wonderland")
      case Person("Roddick", 54) => println("Roddick rocks!")
      case Person("Bruce", 20) => println("Bruce Banner OR Bruce Wayne ?")
    }
  }
}

case class Person(fname: String, age: Int)

/*
Alice in wonderland
Roddick rocks!
Bruce Banner OR Bruce Wayne ?
*/
