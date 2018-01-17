#include<stdio.h>

int Strlen(const char* str)  //strlen函数的递归实现
{
	if(*str == '\0')
		return 0;
	return Strlen(++str) + 1;
}

void reverse_string(char* str)
{
	char temp;
	int len = Strlen(str);
	int i;
	for(i = 0; i < len/2; i++)
	{
		temp = str[i];
		str[i] = str[len - i - 1];
		str[len - i -1] = temp;
	}
}
int main()
{
	char str1[] = "abc";
	char str2[] = "abcd";
	reverse_string(str1);
	reverse_string(str2);
	printf("%s %s\n", str1, str2);
}
