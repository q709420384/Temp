#include<stdio.h>

//了解二分法，以及>>位操作
//递归自己找
int fun(int a[], int length, int result) 
{
	int first = 0, last = length - 1;
	int middle = 0;
	while (first <= last) 
	{
		middle = (first + last) >> 1;
		if (a[middle] == result) 
		{
			return middle;
		} 
		else if (a[middle] > result) 
		{
			last = middle - 1;
		} 
		else 
		{
			first = middle + 1;
		}
	}
	return -1;
}
int main()
{
	in a[6] = {1, 2, 3, 4, 6, 7};
	fun(a, 6, 4);
}
