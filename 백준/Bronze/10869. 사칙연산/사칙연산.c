#include<stdio.h>

int main(){
    int a,b,c,d;
    scanf("%d %d",&c,&d);
    if(c>=1) a=c;
    if(d<=100000) b=d;
    printf("%d\n",a+b);
    printf("%d\n",a-b);
    printf("%d\n",a*b);
    printf("%d\n",a/b);
    printf("%d\n",a%b);
    return 0;
    
}