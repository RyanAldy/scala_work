import scala.beans.BeanProperty

class Result {

  @BeanProperty
  var phy = 0

  @BeanProperty
  var maths = 0

  @BeanProperty
  var chem = 0

  // var Total = phy + maths + chem

  def message() = {
    println("Physics =" + phy)
    println("Maths =" + maths)
    println("Chem = " + chem)
    println("Total = " + (phy + maths + chem))
  }

}
