

object Factorial {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 10) 
      println(i + " �Ľ׳�Ϊ��" + factorial(i))
    
  }
  
  def factorial(i: BigInt): BigInt = {
    if (i <=1 ) {
      1
    } else {
      i * factorial(i - 1)
    }
  }
}