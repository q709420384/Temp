#include<stdio.h>

/*因为在函数的参数列表中为值传递，因此只改变了exchange函数的函数体中局部变量的
 *值，而主函数中的值并未改变
 */
void exchange(int a, int b)
{
	int temp;
	temp = a;
	a = b;
	b = temp;
}
//正确代码
void exchange1(int* a, int* b)
{
	int temp;
	temp = *a;
	*a = *b;
	*b = temp;
}
//不使用中间变量
//使用按位异或
void exchange2(int* a, int* b)
{
	*a = *a ^ *b;
	*b = *b ^ *a;
	*a = *a ^ *b;
}
int main()
{
	int a = 1, b = 2;
	exchange2(&a, &b);   //正确调用 exchange(&a, &b);
			  //& 为取地址符，此处使用的是传地址的方式
	printf("%d %d", a, b);
	return 0;
}
