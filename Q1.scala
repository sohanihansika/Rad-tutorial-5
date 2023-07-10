package lab_5

import scala.io.StdIn
object Q1 {

  def main(args:Array[String])={
    println("Enter a number: ")
    val num = StdIn.readInt()
    println(prime(num))

  }


  def prime(n: Int, i: Int = 2): Boolean = {
    if(n < 2)
      return false

    else if (n == i)
      return true

    else if (n % i == 0)
      return false

    else
      prime(n, i + 1)
  }

}
