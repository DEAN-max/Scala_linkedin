object Hello {
def main(args:Array[String]) {
		val name:String = args(0)
		println("Hello " + name + "!!")
	}	
}

import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._
//values include but are not limited to: CANADA, CANADA_FRENCH
//CHINA, ENGLISH, FRANCE, GERMAN, ITALIAN, JAPAN, KOREA, UK, ...
object PrintDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.ITALIAN)
    println(df.format(now))  
      }
}