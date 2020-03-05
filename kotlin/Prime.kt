object Prime {
  internal class Sieve(prime:Int) {
      private var next:Sieve? = null
      private var prime:Int = 0

      init {
          this.prime = prime
      }

      fun test(n:Int) {
          when {
              this.prime * (n / this.prime) == n -> {
              }
              this.next == null -> {
                  println(n)
                  this.next = Sieve(n)
              }
              else -> {
                  this.next!!.test(n)
              }
          }
      }
  }

  @JvmStatic fun main(args:Array<String>) {
      val s = Sieve(2)
      var i = 2
      println("2")
      while (i < 13)
      {
          i += 1
          s.test(i)
      }
  }
}