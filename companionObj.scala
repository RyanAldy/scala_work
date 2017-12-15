class Bank {

  def setDollar(A :Int) = {
    // This access the dollar variable in the companion object
    Bank.dollar = A
    Bank.message()
}
  def amount(A :Int) = {
    println("Dollarrate = " + Bank.dollar)
    println("Amount = " + Bank.dollar*A)
    }

}
// Singleton
object Bank {

  var dollar :Int = 0
  def message() = {
    println("Dollar rate set")
  }
}

object CompanionMain {

  def main(args: Array[String]): Unit = {

    var HSBC = new Bank()
    var Lloyds = new Bank()
    var Barclays = new Bank()

    HSBC.setDollar(2)
    HSBC.amount(300)
    Lloyds.setDollar(3)
    Lloyds.amount(500)
  }
}
