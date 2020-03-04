package main

type Sieve struct {
	prime int
	prev  *Sieve
}

func Test(payload *Sieve, n int) {
	if payload.prime*(n/payload.prime) == n {

	} else if payload.prev == nil {
		println(n)

		p := *payload
		*payload = Sieve{
			prime: n,
			prev:  &p,
		}
	} else {
		Test(payload.prev, n)
	}
}

func main() {
	var p = Sieve{
		prev:  nil,
		prime: 2,
	}

	println(2)

	for i := 2; i < 10; i++ {
		Test(&p, i)
	}
}
