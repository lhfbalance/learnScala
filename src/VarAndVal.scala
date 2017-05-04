import first.FirstScalaClass
object VarAndVal {
  
  var hello = "hello"
  
  def greet(name: String): String = {
    hello + " -_- " + name
  }
  
  def main(args: Array[String]) {
    
    println(greet("louhf"))
    var v = new FirstScalaClass
    print(v.append("123", "abc"))
  }
}