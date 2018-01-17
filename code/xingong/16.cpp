#include<stdio.h>
#include<stdlib.h>
#include<string.h>
/*
 * 了解二级指针
void getMemory(char ** p, int num) {
	*p = (char *)malloc(num * sizeof(char));
}
int main(void) {
	char * str = NULL;
	getMemory(&str, 10);
	strcpy(str, "hello");
	free(str);
	return 0;
}
*/
//此处是第二种方法，使用了c++中的引用，可以自行了解,程序文件应为*.cpp
void getMemory(char* &p, int num) {
	p = (char *)malloc(num * sizeof(char));
}
int main(void) {
	char * str = NULL;
	getMemory(str, 10);
	strcpy(str, "hello");
	free(str);
	return 0;
}
