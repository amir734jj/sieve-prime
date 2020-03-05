class Sieve {

  private _prime: number;
  private _next: Sieve;

  constructor(prime: number) {
    this._prime = prime;
  }

  public test(n: number) {
    if ((this._prime * (n / this._prime)) == n) {
    }
    else if ((this._next == null)) {
      console.log(n);
      this._next = new Sieve(n);
    }
    else {
      this._next.test(n);
    }

  }
}

function main() {
  let s = new Sieve(2);
  let i = 2;
  console.log("2");
  while ((i < 10)) {
    i++;
    s.test(i);
  }
}

main();