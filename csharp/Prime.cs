using System;

internal class Sieve
{
    private readonly int _prime;

    private Sieve _next;
    
    public Sieve(int prime)
    {
        _prime = prime;
    }
    
    public void Test(int n)
    {
        if (_prime * (n / _prime) == n)
        {

        }
        else if (_next == null)
        {

            Console.WriteLine(n);
            _next = new Sieve(n);
        }
        else
        {
            _next.Test(n);
        }
    }
}

public class Prime
{
    public static void Main(string[] args)
    {
        var s = new Sieve(2);
        var i = 2;

        Console.WriteLine("2");

        while (i < 10)
        {
            i += 1;
            s.Test(i);
        }
    }
}
