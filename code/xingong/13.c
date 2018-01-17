#include<stdio.h>

#define SQR(x) x - x
//了解宏定义
int main(void) 
{
	int x = 5;
	printf("%d\n", x * SQR(x) - x);
	return 0;
}
