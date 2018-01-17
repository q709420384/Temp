#include<stdio.h>

int fun(int a, int b) 
{
	if (a > b)
		return (a == b) ? a : b;
	else
		return a + b + fun(a + 2, b - 1);
}

int main()
{
	printf("%d\n",fun(2, 7));
}
