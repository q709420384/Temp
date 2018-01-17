#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main(void) 
{
	char *p1 = "abcdefg"; //语句 A
	char *p2 = (char *)malloc(sizeof(char) * strlen(p1));
	//char *p2 = (char*)malloc(sizeof(char) * strlen(p1) + 1);
	//因为在"abcdefg"里面还包含有一个'\0'
	//改成char p1[7] = {'a','b','c','d','e','f','g'}
	//程序会出问题（自己去试）原因时strlen判断段长度函数没检测到'\0'引起的
	strcpy(p2, p1);
	return 0;
}
