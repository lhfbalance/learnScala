object TransportValue {
   def main(args: Array[String]) {
        delayed(time());
   }

   def time() : Long = {
      println("��ȡʱ�䣬��λΪ����")
      System.nanoTime
   }
   def delayed( t: => Long ) = {
      println("�� delayed ������")
      println("������ " + t)
      t
   }
}