object Arrays {
  var movies: Array[String] = new Array[String] (5)
                                                  //> movies  : Array[String] = Array(null, null, null, null, null)
// When all the array elements are not assigned a value they are auto assigned as NULL by default.  
  movies(0) = "Sonic and the Hedgehog"
  
  var furniture = Array("TV", "Bed", "Sofa", "Rocker")
                                                  //> furniture  : Array[String] = Array(TV, Bed, Sofa, Rocker)
// When printing the array values we are getting the reference values.  
  print(movies)                                   //> [Ljava.lang.String;@3712b94
  println(furniture)                              //> [Ljava.lang.String;@2833cc44
}

