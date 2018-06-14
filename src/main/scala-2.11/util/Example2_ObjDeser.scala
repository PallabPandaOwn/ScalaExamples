package util

import java.io._

object Example2_ObjDeser {
  def main(args: Array[String]): Unit = {
    // (3) read the object back in
    val ois = new ObjectInputStream(new FileInputStream("E:\\AIMIA\\workspace\\scala-examples\\src\\main\\resources\\REL.ser"))
    //val obj = ois.readObject
    val stock = ois.readObject.asInstanceOf[Stock]
    ois.close

    // (4) print the object that was read back in
    println("Deserializing " + stock)
  }
}
