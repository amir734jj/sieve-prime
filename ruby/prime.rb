#!/usr/bin/env ruby

class Sieve
  @prime
  @next

  def initialize(prime)
    @prime = prime
  end

  def test(n)
    if @prime * (n / @prime) == n

    elsif @next.nil?
      puts(n)
      @next = Sieve.new(n)
    else
      @next.test(n)
    end
  end
end


def main
  s = Sieve.new(2)
  i = 2

  puts("2")

  while i < 13
    i += 1
    s.test(i)
  end
end

main