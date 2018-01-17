#include<stdio.h>
#include<stdlib.h>

int main(int argc, char ** argv)
{
	printf("argc = %d\n", argc);
	int arr[1500];
	
	int i = 0;
	while(argv[i] != NULL)
	{
		printf("argv[%d] = %s, address = %x &argc[%d][0] = %x\n",i, argv[i], &argv[i], i, &argv[i][0]);
		i++;
	}
	puts("");
	i = 0;
	while(i < 1500)
	{
		printf("&arr[%d] = %x\n", i, &arr[i]);
		i++;
	}
	return 0;
}
