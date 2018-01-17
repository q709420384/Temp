#include<stdio.h>
typedef union unRec
	{
		unsigned long ullndex;
		unsigned short usLevel[7];
		unsigned char ucPos;
}REC_S;
int main()
{
	printf("%d\n", sizeof(REC_S));
	return 1;
}
