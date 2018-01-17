#include<stdio.h>

int sum(int n)
{
	char arr[n][n + 1];
	return sizeof(arr)>>1; 
}
int main()
{
	printf("%d\n", sum(100));
}
