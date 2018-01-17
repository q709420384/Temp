#include<stdio.h>

int main()
{
	int a = 3, b = 5, c = 7;
	float d = (float)a + b / c;  // b / c 的结果为0，a被强转为了float
	printf("%f", d);
	return 0;
}
