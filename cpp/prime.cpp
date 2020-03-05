#include <iostream>

#define NULL 0

class Sieve {
private:
    int _prime;
    Sieve* _next = NULL;

public:
    Sieve(int prime) {
        _prime = prime;
    }

    void test(int n) {
        if (_prime * (n / _prime) == n) {
        } else if (_next == NULL) {
            std::cout << n << std::endl;
            _next = new Sieve(n);
        } else {
            _next->test(n);
        }
    }
};

int main() {
    Sieve* s = new Sieve(2);
    int i = 2;

    std::cout << "2" << std::endl;

    while (i < 12) {
        i += 1;
        s->test(i);
    }

    return 0;
}
