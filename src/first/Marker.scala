package first

/* �ļ�����Marker.scala
 * author:����̳�
 * url:www.runoob.com
 */

// ˽�й��췽��
class Marker private (val color: String) {

  println("����" + this)

  override def toString(): String = "��ɫ��ǣ�" + color

}

// �����������๲�����֣����Է������˽�����Ժͷ���
object Marker {

  private val markers: Map[String, Marker] = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green"))

  def apply(color: String) = {
    if (markers.contains(color)) markers(color) else null
  }

  def getMarker(color: String) = {
    if (markers.contains(color)) markers(color) else null
  }
  def main(args: Array[String]) {
    println(Marker("red"))//Ϊʲô����õ�apply����
    // �����������ã�ʡ����.(��)����  
    println(Marker getMarker "blue")
  }
}