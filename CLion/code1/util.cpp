#include <stdio.h>

static int max(int x, int y) {
    if (x > y) {
        return x;
    } else {
        return y;
    }
}

void help(void) {
    printf("******************************\n");
}


static int j = 10;