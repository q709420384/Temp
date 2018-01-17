typedef union {
	long i;
	int k[5];
	char c;
} DATE;
struct data {
	int cat;
	DATE cow;
	double dog;
};
int main(void) {
	DATE max;
	printf("%d", sizeof(struct data) + sizeof(max));
	return 0;
}
