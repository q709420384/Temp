#include<stdio.h>

int main(void) 
{
	unsigned int col, row;
	int a[10][5] = {{0}, {0, 5}};
/*
	for(int i = 9; i>=0; i--)
	{
		for(int j = 4; j>=0; j--)
			printf("%d ", a[i][j]);
		printf("\n");
	}
*/			

	//原来的操作中数组下标越界了,以及了解unsigned int的范围
	for (row = 9; row >= 0; row--)
	{
		for (col = 4; col >= 0; col--)
		{
			printf("%u  ", col);
			puts(" ");
			printf("%d\n", a[row][col]);
		}
	}

	return 0;
}
