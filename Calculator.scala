//

object CalcMain {
  def main(args: Array[String]) = {

    if (args.length !=3) {
      println("Input 3 numbers only!")
      System.exit(1)
    }
    else {
      var first_num = 0L
      var second_num = 0L
      try {
        first_num = args(0).toLong
        second_num = args(2).toLong

      } catch {
        case e: NumberFormatException => println("First and third args should be number")
        System.exit(1)
      }

      try {

        args(1) match {
          case "+" => println("Addition: " + (first_num + second_num))
          case "-" => println("Subtraction: " + (first_num - second_num))
          case "/" => println("Division: " + (first_num / second_num))
          case "X" => println("Multiplication: " + (first_num * second_num))
          case _ => println("Operator must be X + / -")
        }
      } catch {
        case e: ArithmeticException => println("Cannot divide by Zero!!!!")
      }
    }

  }
}
