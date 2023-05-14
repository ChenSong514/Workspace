#include<stdio.h>
#include <stdlib.h>


int getLength(char *str);

int main() {

    char *str;
    str = (char *) malloc(sizeof(char));
    printf("请输入字符串:\n");
    gets(str);
    int len = getLength(str);
    printf("字符串 %s 的长度是:%d\n", str, len);
}

int getLength(char *str) {
    int len = 0;
    while (*str) {
        str++;
        len++;
    }
    return len;
}


void sort(int *p) {
    for (int i = 0; i < 3; ++i) {
        for (int j = i; j < 3; ++j) {
            if (*(p + i) < *(p + j)) {
                int tmp = *(p + i);
                *(p + i) = *(p + j);
                *(p + j) = tmp;
            }
        }
    }
}

void foo1();

void print_val(int *x) {
    printf("%d\n", ++*x);
}

int *f(int *x, int *y) {
    if (*x < *y) {
        return x;
    } else {
        return y;
    }
}


#include <string.h>


int fun(double x[10], int *n) {
    printf("echo");
}

void foo1() {
    void sort(float score[], int size);
    float score[5];
    printf("请输入5个数字:");
    scanf("%f%f%f%f%f", &score[0], &score[1], &score[2], &score[3], &score[4]);
    sort(score, 5);
    printf("排序后的结果是:\n");
    for (int i = 0; i < 5; ++i) {
        printf("%.2f ", score[i]);
    }
}

/**
 * 从大到小排序
 * @param score   数组
 * @param size  数组大小
 */
void sort(float score[], int size) {
    for (int i = 0; i < size; i++) {
        for (int j = i; j < size; ++j) {
            if (score[i] < score[j]) {
                float temp = score[i];
                score[i] = score[j];
                score[j] = temp;
            }
        }
    }
}


void foo() {

}


void usingIf(float x) {
    float y = -1;
    if (x >= 0 && x < 2) {
        y = x;
    } else if (x >= 2 && x < 4) {
        y = 2 * x - 2;
    } else if (x >= 4) {
        y = 3 * x - 6;
    } else {
        printf("未定义");
    }
    if (y != -1) {
        printf("y的值是:%.2f", y);
        printf("y的值是:%.2f", y);
    }


}


void usingSwich(float x) {
    float y = -1;
    printf("x的值是:%.2f", x);
    int i, j;
    scanf("%d%d", &i, &j);
    if (x < 0) {
        printf("未定义");
        return;
    }
    switch ((int) (x / 2)) {
        case 0:
            y = x;
            break;
        case 1:
            y = 2 * x - 2;
            break;
        default:
            y = 3 * x - 6;
            break;
    }
    if (y != -1) {
        printf("y的值是:%.2f", y);
    }
}



