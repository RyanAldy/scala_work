// Private members

class PersonalInfo(private var Na:String, private var Marks:Int) {

  private def details() = {
    println("Name: " + Na)
    println("Marks: " + Marks)
  }
}

object PersonalInfo{
  def showDetails(Ref:PersonalInfo) = {
    Ref.details()
  }
}

object DetailsMain {
  def main(args: Array[String]): Unit = {
    var Ryan = new PersonalInfo("Ryan", 26)

    PersonalInfo.showDetails(Ryan)
  }
}

// Compiled using scalac and then 
// Run using scala -cp C:\Users\Admin\Documents\scala_work DetailsMain
