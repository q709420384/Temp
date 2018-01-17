#include<stdio.h>

//统计二进制位中含有1的个数
int func(int x) 
{
	int countx = 0;
	while(x) 
	{
		countx++;
		x = x & (x - 1);
	}
	return countx;
}
int main()
{
	int a;
	scanf("%d", &a);
	printf("%d\n",func(a));
	return 0;
}
