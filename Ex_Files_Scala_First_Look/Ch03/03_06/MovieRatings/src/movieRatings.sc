object movieRatings {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	var movies = Map("Finding Nemo"->"G", "Finding Dory"->"PG",
	"Men In Black"->"PG-13", "The Avengers"->"PG-13")
                                                  //> movies  : scala.collection.immutable.Map[String,String] = Map(Finding Nemo -
                                                  //| > G, Finding Dory -> PG, Men In Black -> PG-13, The Avengers -> PG-13)
	
	var rating = movies("The Avengers")       //> rating  : String = PG-13
	println(rating)                           //> PG-13
	
	movies.foreach(println)                   //> (Finding Nemo,G)
                                                  //| (Finding Dory,PG)
                                                  //| (Men In Black,PG-13)
                                                  //| (The Avengers,PG-13)
	
	movies+="Harry Potter and The Sorcerer's Stone"->"PG"
	
	movies.foreach(println)                   //> (The Avengers,PG-13)
                                                  //| (Finding Nemo,G)
                                                  //| (Men In Black,PG-13)
                                                  //| (Finding Dory,PG)
                                                  //| (Harry Potter and The Sorcerer's Stone,PG)
	
	
}