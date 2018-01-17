#include<iostream>
#include<string.h>
using namespace std;
class base
{
private:
	char *str;
public:
	base(const char *s = "null")
	{
		str = new char[strlen(s) + 1];
		strcpy(str, s);
	}
	base(const base &b)
	{
		str = new char[strlen(b.str) + 1];
		strcpy(str, b.str);
	}
	~base()
	{
		delete [] str;
	}
	char* print()
	{
		return str;
	}

};
int main()
{
	base test1("Hello!");
	base test2(test1);
	cout << "test1 = " << test1.print() << endl;
	cout << "test2 = " << test2.print() << endl;
}
