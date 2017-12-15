// Constructors example

class ResultTwo(a:String) {

  // This is the primary constructor
  println("My name is Ryan!")

  def message() {
    println("A is equal to: " + a)
  }

// Auxillary constructor
  def this(A:String, B:String, C:String) {
    // First line always has to call the primary constructor
    this("Ryan")
    this.message()
    println("Secondary constructor called: " + A + " " + B + " " + C)
  }

}
