

object AnonymousFunction {
  
//  def main(args: Array[String]): Unit = {
//    println(add2(5).toString())
//  }
//  
//  def add2 = new Function1[Int, Int] {
//    def apply(x: Int): Int = x + 1
//  }
  
  
//   def main(args: Array[String]) {
//      println( "multiplier(1) value = " +  multiplier(1) )
//      println( "multiplier(2) value = " +  multiplier(2) )
//   }
//   var factor = 3
//   val multiplier = (i:Int) => i * factor
  
  
  def main(args: Array[String]): Unit = {
    var userDir = () => { System.getProperty("user.dir") }
    var userDir2 = () => { System.getProperty("user.dir") }
    var mul = (x: Int, y: Int) => x * y
    println(userDir())
    println(userDir2())
    println(mul(5,16))
  }
}