import Array._

object TestArray {
//  def main(args: Array[String]): Unit = {
//    var arrayString = Array[String]("1","2","3")
//    
//    for(x <- arrayString)
//      println(x)
//  }
  
   def main(args: Array[String]) {
      var myList1 = Array(1.9, 2.9, 3.4, 3.5)
      var myList2 = Array(8.9, 7.9, 0.4, 1.5)

      var myList3 =  concat( myList1, myList2)
      
      // �����������Ԫ��
      for ( x <- myList3 ) {
         println( x )
      }
   }
}