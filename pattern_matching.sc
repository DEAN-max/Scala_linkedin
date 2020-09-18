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
}
