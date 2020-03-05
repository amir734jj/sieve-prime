safeHead :: t -> [t] -> t
safeHead x xs =
  if length (xs) == 0
    then x
    else head xs

sieve :: [Int] -> Int -> [Int]
sieve primes 2 = 2 : primes
sieve primes n = do
  let prime = safeHead 2 primes
  if prime * (n `div` prime) == n
    then do
      primes
    else if length (primes) == 0
           then n : primes
           else sieve (tail primes) n

main = do
  print (sieve [] 10)