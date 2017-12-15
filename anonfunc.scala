// Anonymous functions and nested functions

def calculation (F:(Int, Int) => Int) {

    println("The result is: " + F(2,7))
}

var add = (A:Int, B:Int) => A + B
var sub = (A:Int, B:Int) => A - B

calculation(add)
calculation(sub)

// Nested function
def fun() = {

  var x = (A: Int, B: Int) => {

    var c = 0
    if (A > B) {
      c = A
    }
    else {
      c = B
    }
    println("The other result is: " + c)
  }
  // Don't need to use return but this returns the function
  x
}

var A = fun()
A(7,2)
