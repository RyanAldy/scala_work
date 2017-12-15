// Print numbers to words

def convert_up_to_twenty(a: Int) : String = {

  val number_map = Map(0 -> "", 1 -> "One", 2 -> "Two", 3 -> "Three", 4 -> "Four",
                  5 -> "Five", 6 -> " Six", 7 -> "Seven", 8 -> "Eight", 9 -> "Nine",
                  10 -> "Ten", 11 -> "Eleven", 12 -> "Twelve", 13 -> "Thirteen",
                  14 -> "Fourteen", 15 -> "Fifteen", 16 -> "Sixteen", 17 -> "Seventeen",
                  18 -> "Eighteen", 19 -> "Nineteen")

  var out_num_word = number_map(a)
  return out_num_word
}

def convert_tens(a: Int) : String = {
  val tens_map = Map(2 -> "Twenty", 3 -> "Thirty", 4 -> "Forty", 5 -> "Fifty", 6 -> "Sixty", 7 -> "Seventy", 8 -> "Eighty", 9 -> "Ninety")

  var out_num_word = tens_map(a)
  return out_num_word

}

def convert_num(b: Int) : String = {

  var a = b
  var output_string = ""

  if (a >= 1000 & a <= 9999) {
    output_string = output_string + (convert_up_to_twenty(a/1000)).toString + " Thousand "
    a = a - (a/1000*1000)
    if (a < 100 & a > 0) {
        output_string += "and "
      }
  }
  if (a >= 100 & a <= 1000) {
    output_string = output_string + (convert_up_to_twenty(a/100)).toString + " Hundred "
    a = a - (a/100*100)
    if (a < 100 & a > 0) {
        output_string += "and "
      }
  }
  if (a >= 20 & a < 100) {
    output_string = output_string + (convert_tens(a/10)).toString + " "
    a = a - (a/10*10)
  }
  if (a < 20) {
    output_string = output_string + convert_up_to_twenty(a)
}

return output_string
}

println(convert_num(250))
