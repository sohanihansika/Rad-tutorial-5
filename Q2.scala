package lab_5

import scala.io.StdIn
object Q2 {

  def main(args:Array[String])={
    println("Enter the number")
    val num = StdIn.readInt()
    print("prime numbers up to " + num +" : ")
    primeSeq(num-1)
  }

  def prime(n: Int, i: Int = 2): Boolean = {
    if (n < 2)
      return false

    else if (n == i)
      return true

    else if (n % i == 0)
      return false

    else
      prime(n, i + 1)


  }

  def primeSeq(n:Int):Unit={
    if(n == 2)
      print(n)

    else {
      primeSeq(n-1)
      if(prime(n))
        print("," + n)
    }

  }

}
