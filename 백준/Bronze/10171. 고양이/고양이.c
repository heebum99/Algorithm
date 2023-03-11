#include<stdio.h>

int main() {
    char a[20] = "\\    /\\";
    char b[20] = " )  ( ')";
    char c[20] = "(  /  ) ";
    char d[20] = " \\(__)| ";
    printf("%s\n", &a);
    printf("%s\n", &b);
    printf("%s\n", &c);
    printf("%s\n", &d);
    return 0;
}