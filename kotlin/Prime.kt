object Prime {
  internal class Sieve(prime:Int) {
    private val next:Sieve
    private val prime:Int = 0

    init {
      this.prime = prime
    }

    fun test(n:Int) {Î
      if (this.prime * (n / this.prime) == n)
      {
      }
      else if (this.next == null)
      {
        println(n)
        this.next = Sieve(n)
      }
      else
      {
        this.next.test(n)
      }
    }
  }
  
  @JvmStatic fun main(args:Array<String>) {
    val s = Sieve(2)
    val i = 2
    println("2")
    while (i < 13)
    {
      i += 1
      s.test(i)
    }
  }
}