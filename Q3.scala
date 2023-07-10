package lab_5

import scala.io.StdIn
object Q3 {

  def main(args:Array[String])={
    println("enter the number: ")
    val num = StdIn.readInt()
    print("sum of 1 to " + num + ": "+sum(num))

  }

  def sum(n:Int):Int= {

    if (n >= 1)
      return n + sum(n - 1)

    else
      return 0
  }


}
