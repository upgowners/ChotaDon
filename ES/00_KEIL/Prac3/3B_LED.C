#include<reg51.h>
void delay(int time);
void main()
{
	P1=0x01;
	delay(1000);
	P1=0x01;
	delay(1000);
	P1=0x02;
	delay(1000);
	P1=0x04;
	delay(1000);
	P1=0x08;
	delay(1000);
	P1=0x10;
	delay(1000);
	P1=0x20;
	delay(1000);
	P1=0x40;
	delay(1000);
	P1=0x80;
	delay(1000);
		
}
void delay(int time) // Generates a Delay of Desired Amount
{
	int i,j;    // Initialize variable i,j for Generating Delay
	for(i=0;i<=time;i++)
	{
		for(j=0;j<=1275;j++); // This for loop generates Delay of 1millisecond
		
	}	
}