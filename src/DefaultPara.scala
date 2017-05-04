

object DefaultPara {
  def main(args: Array[String]): Unit = {
    println(add())
  }
  
  def add(a: Int=2, b:Int=1): Int = {
    a+b
  }
}