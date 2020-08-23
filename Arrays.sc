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
  // Printing out array value of a specific position.
  println(movies(0))                              //> Sonic and the Hedgehog
  println(furniture(3))                           //> Rocker
  
  // Defining the print function to loop through the array elements and print out the element values. Return type is mentioned as Unit as there are no return type of this function.
  def print(strArray: Array[String]): Unit = (strArray.foreach(println))
                                                  //> print: (strArray: Array[String])Unit
  
  print(movies)                                   //> Sonic and the Hedgehog
                                                  //| null
                                                  //| null
                                                  //| null
                                                  //| null
  print(furniture)                                //> TV
                                                  //| Bed
                                                  //| Sofa
                                                  //| Rocker
  
  var t = new Array[AnyVal](3)                    //> t  : Array[AnyVal] = Array(null, null, null)
  t(0) = true
  t(1) = 1.44423232
  t(2) = 665
  t.foreach(println)                              //> true
                                                  //| 1.44423232
                                                  //| 665
  // Updating an array value internally calls update method.
  t(1) = false
  // We can also use the update method to update array values.
  t.update(1, false)

  t.foreach(println)  
}

