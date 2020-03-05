#include <stdio.h>

#define NULL 0

struct PayloadPtr {
    int prime;
    struct PayloadPtr *next;
};

typedef struct PayloadPtr *Payload;

Payload new_payload(int prime, Payload next) {
    Payload p = (Payload) malloc(sizeof(struct PayloadPtr));
    p->prime = prime;
    p->next = next;
    return p;
}

void test(Payload *p, int n) {
    if ((*p)->prime * (n / (*p)->prime) == n) {

    } else if ((*p)->next == NULL) {
        printf("%d\n", n);

        *p = new_payload(n, *p);
    } else {
        test(&((*p)->next), n);
    }
}

int main() {
    Payload p = new_payload(2, NULL);

    printf("%d\n", 2);

    int i;
    for (i = 2; i < 13; i++) {
        test(&p, i);
    }

    return 0;
}