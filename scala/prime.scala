class Sieve(var prime : Int) {
  var next : Sieve = _

  def test(n : Int) : Unit = {
    if (prime * (n / prime) == n)
      ()
    else if (next == null) {
      println(n)
      next = new Sieve(n)
    } else next.test(n)
  }
}

object Driver {
  def main(args: Array[String]): Unit = {
    val s: Sieve = new Sieve(2)
    var i : Int = 2

    println("2")

    while (i < 10) {
      i = i + 1
      s.test(i)
    }
  }
}