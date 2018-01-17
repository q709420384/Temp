#include<stdio.h>

int main()
{
	int a = 0, b = 2, x = 1;
	if(--a)
	if(!b) x = 7;
	else ++x;
	x |= 0x0110;            //了解16进制转2进制 以及 | 运算符
	printf("%d", x);
	return 0;
}
