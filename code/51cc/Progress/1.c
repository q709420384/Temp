#include<stdio.h>
#include<unistd.h>
#include<string.h>
int main()
{
	int i;
	char ch[100];
	for(i=0;i<5;i++)
	{
		printf("\033[36m正在加载,请稍等\033[0m\n");
		strcat(ch,"***************");
		printf("\033[46m%-75s\033[0m\007\n",ch);
		sleep(1);
		system("clear");
		
	}
	printf("\033[36m加载完毕！\n\033[0m");
}
