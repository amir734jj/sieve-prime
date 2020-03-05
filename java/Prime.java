public class Prime {

  static class Sieve {
    private Sieve next;
    private int prime;

    Sieve(int prime) {
      this.prime = prime;
    }

    void test(int n) {
      if (this.prime * (n / this.prime) == n) {

      } else if (this.next == null) {
        System.out.println(n);
        this.next = new Sieve(n);
      } else {
        this.next.test(n);
      }
    }
  }

  public static void main(String[] args) {

    Sieve s = new Sieve(2);
    int i = 2;

    System.out.println("2");

    while (i < 13) {
      i += 1;
      s.test(i);
    }
  }
}
