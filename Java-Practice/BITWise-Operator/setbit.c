#include<stdio.h>
int main(){
	int n=5;
	int pos=1;
	int mask=1<<pos;
	int newNum = mask | n;
	printf("NewNum = %d",newNum);
	return 0;
}