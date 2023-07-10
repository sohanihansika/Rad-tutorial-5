package lab_5

import scala.io.StdIn
object Q5 {

  def main(args:Array[String])={
    println("Enter a number: ")
    val num = StdIn.readInt()
    print(sumEven(num))
  }

  def sumEven(n:Int):Int=n match{
    case x if (x <= 0)=> 0
    case x if x%2==0 => n+sumEven(n-2)
    case _ => sumEven(n-1)




  }
}
