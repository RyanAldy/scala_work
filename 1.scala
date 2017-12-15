var phy = 75
var chem = 60
var math = 80
val total = phy + chem + math
val per = total * 100/300

println("Total marks = " + total)
println("Percentage = " + per)

if (per >= 60) {
  println("Pass")

} else {
  println("Fail")
}
