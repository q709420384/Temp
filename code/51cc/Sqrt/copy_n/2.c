#include <stdio.h>
#include <stdlib.h>

void copy_n(char dst[], char src[], int n);

int main(int argc, char *argv[])
{
    char src[5] = {'a','b','c','d', '\0'};
    char dst[9];
    int n = 6;
    int i;

    copy_n(dst, src, n);

    for(i = 0; i < 6; i++)
    printf("%c",dst[i]);

    return 0;
}

void copy_n(char dst[], char src[], int n)
{
    char *psrc = src ;
    char *pdst = dst;
    while(n)
    {
        if(*psrc == '\0')
	{
	    *pdst++ = '\0';
	}
	else
	{
	    *pdst++ = *psrc++;
	}
	n--;
    }
}
