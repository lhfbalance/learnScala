import java.util.Date

object PartialApplication {
//  def main(args: Array[String]): Unit = {
//    val date = new Date
//    log(date, "message1")
//    Thread.sleep(1000)
//    log(date, "message2")
//    Thread.sleep(1000)
//    log(date, "message3")
//  }
  /**
   * ƫӦ�ú���
   */
  def main(args: Array[String]): Unit = {
    val date = new Date
    val logmessage = log(date, _: String)
    logmessage("message1")
    logmessage("message2")
    logmessage("message3")
  }
  
/**
 * ���������ķ�ʽ�ﵽͬ��Ч��
 */
//  def main(args: Array[String]): Unit = {
//    val date = new Date
//    val logmessage = (message: String) => log(date, message)
//    logmessage("message1")
//    logmessage("message2")
//    logmessage("message3")
//  }
  
  def log(date: Date, message: String): Unit = {
    println(date + "-------" + message)
  }
}