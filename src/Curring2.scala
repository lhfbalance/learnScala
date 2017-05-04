

object Curring2 {
//  def main(args: Array[String]): Unit = {
//    println(add(2, 3))
//    println(addCurring(2)(3))
//    println(complex(1)(5)(2))
//  }
//  
//  def complex(x: Int)(y: Int)(z: Int) = add(x, y) 
//  
//  def addCurring(x: Int)(y: Int) = x + y
//  
//  def add(x: Int, y: Int): Int = {
//    println("x is " + x)
//    println("x + y = " + (x + y))
//    return (x + y)
//  }
  
  def main(args: Array[String]): Unit = {
    var result = add(1)
    println(result)
    var result2 = result(2)
    println(result2)
  }
  
  def add(x: Int) = (y: Int) => x+y
    
}