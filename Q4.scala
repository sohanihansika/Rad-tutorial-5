package lab_5

import scala.io.StdIn
object Q4 {

  def main(args:Array[String])={
    println("Enter a number: ")
    val num = StdIn.readInt()
    print(isEven(num))
  }

  def isEven(n:Int):String= n match{
    case x if x==0 =>"Even number"
    case _ => isOdd(n-1)
  }

  def isOdd(n:Int):String = n match{
    case x if x==0 => "Odd number"
    case _ => isEven(n-1)
  }
}
