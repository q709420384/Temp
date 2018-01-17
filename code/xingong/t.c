#include <stdio.h>
int  fun(int a[],int first,int last,int result)
{
	int middle=(first+last)/2;
	if(first>last)
	{
		printf("没有该数");
		return;
	}
	if(a[middle]==result)
	{
		printf("%d",middle);
		return;
	}
	else if(a[middle]>result)
	{
		fun(a,first,middle-1,result);
	}
	else if(a[middle]<result)
	{
		fun(a,middle+1,last,result);
	}
}
void main()
{
	int a[6]={1,2,3,4,6,7};
	fun(a,0,5,4);
}

