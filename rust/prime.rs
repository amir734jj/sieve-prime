struct Sieve {
    prime: i32,
    next :  Option<Box<Sieve>>
}

fn test(payload :&Sieve, n: i32) {
    if (payload.prime * (n / payload.prime) == n) {
        
    } else if (payload.next == nil) {
    
    } else {
        test(payload.next, n)
    }
}

fn main() {
    let mut payload = Sieve { 
        prime: 2
    }

    println!("2")
}