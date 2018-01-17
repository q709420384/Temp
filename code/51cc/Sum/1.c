#include<stdio.h>

int sum(int n)
{
	return n + (n > 1 ? sum(n - 1) : 0);
}
int main()
{
	printf("%d\n", sum(100));
}
