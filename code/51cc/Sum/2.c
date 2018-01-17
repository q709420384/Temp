#include<stdio.h>

int sum(int n)
{
	int s = n;
	s && (s += sum(n -1));
        return s;
}
int main()
{
        printf("%d\n", sum(100));
}

