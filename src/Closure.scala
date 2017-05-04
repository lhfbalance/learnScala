

object Closure {
  def main(args: Array[String]): Unit = {
    println(multiplier(5));
    println(mul(5))
    println(Curring2.add(5)(5))
  }
  
  var factor = 6
  var multiplier = (x: Int) => x * factor
  
  def mul(x: Int): Int = {
    x * factor
  }
}