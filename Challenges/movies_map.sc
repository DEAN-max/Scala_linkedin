object Movie_map_proj {
  var movies = Map("Avengers Age of Ultron" -> "PG-13", "Men in Black" -> "PG-13", "San Andreas" -> "PG-18", "Coco" -> "PG")
                                                  //> movies  : scala.collection.immutable.Map[String,String] = Map(Avengers Age o
                                                  //| f Ultron -> PG-13, Men in Black -> PG-13, San Andreas -> PG-18, Coco -> PG)
                                                  //| 
  movies("Coco")                                  //> res0: String = PG
  println(movies("Coco"))                         //> PG
  println(movies)                                 //> Map(Avengers Age of Ultron -> PG-13, Men in Black -> PG-13, San Andreas -> P
                                                  //| G-18, Coco -> PG)
  movies.foreach(println)                         //> (Avengers Age of Ultron,PG-13)
                                                  //| (Men in Black,PG-13)
                                                  //| (San Andreas,PG-18)
                                                  //| (Coco,PG)
  movies += ("Charlie and the Chocolate Factory" -> "PG")
  movies += "MI 6" -> "PG-13"
  movies.foreach(println)                         //> (Men in Black,PG-13)
                                                  //| (MI 6,PG-13)
                                                  //| (San Andreas,PG-18)
                                                  //| (Charlie and the Chocolate Factory,PG)
                                                  //| (Avengers Age of Ultron,PG-13)
                                                  //| (Coco,PG)
}
