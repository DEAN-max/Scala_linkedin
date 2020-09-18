package Practice

object pattern_matching extends App{
  def greekLetter(letter: Char): String ={
    letter match{
      case 'A' | 'a' => "Alpha"
      case 'B' | 'b' => "Beta"
      case _ => "Invalid character."
    }
  }
  println("The greek letter for B is: " + greekLetter('b'))

  // Another example.
  def max(a: Int, b: Int): Int = {
    a > b match {
      case true => a
      case false => b
    }
  }
  println("Max of 2 numbers is: " + max(400, 500))
}
