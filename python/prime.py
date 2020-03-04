class Sieve:
  def __init__(self, prime):
    self.prime = prime
    self.next = None
  
  def test(self, n):
    if self.prime * int(n / self.prime) == n:
      return None
    elif self.next == None:
      print(n)
      self.next = Sieve(n)
    else:
      self.next.test(n)

def main():
  s = Sieve(2);

  print("2");

  for i in range(2, 10):
      s.test(i)
  
if __name__== "__main__":
  main()