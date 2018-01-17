#include<stdio.h>
#include<math.h>
double my_sqrt(double N)
{	
	double x1 = 1;
	double x2 = x1/2.0+N/2.0/x1;  

	while( fabs(x2-x1)>0.001)  
	{  
		x1 = x2;  
		x2 = x1/2.0+N/2.0/x1;  
	}  
	return x2;
}
int main()
{
	double n;
	scanf("%lf", &n);
	printf("%lf\n", my_sqrt(n));
}
