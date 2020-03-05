class Sieve {

  constructor(prime) {
    this.prime = prime;
    this.next = null;
  }

  test(n) {
    if (this.prime * ((n / this.prime | 0)) === n) {}
    else if (this.next == null) {
      console.info(n);
      this.next = new Sieve(n);
    } else {
      this.next.test(n);
    }
  }
}



function main() {
  var s = new Sieve(2);
  var i = 2;
  console.info("2");
  while ((i < 13)) {
    {
      i += 1;
      s.test(i);
    }
  }
}

main();