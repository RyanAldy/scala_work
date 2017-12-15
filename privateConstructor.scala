// Private after the class name means that the constructor is private

class One private {
  def message() = {
    println("Hello my friends!")
  }
}

object One {
  // This creates the reference once, if it was inside the method then it would create a new reference every time
    var a: One = new One()

    def createObject():One = {
    return(a)
  }
}

object OneMain {
  def main(args: Array[String]): Unit = {

    var newref = One.createObject()
    println(newref)

    var newreftwo = One.createObject()
    println(newreftwo)
  }
}
