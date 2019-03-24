#include<reg51.h>
#include<intrins.h>
void delay(int time);
void main()
/* Start of main() function*/
{
	unsigned char DIGIT[10]={0x3F,0x06,0x5B,0x4F,0x66,0x6D,0x7D,0x07,0x7F,0x6F};
/* Create a look-up table (array) named DIGIT to send appropriate values to DAC so that a sine-wave is generated.Refer to table */
int i;/*variable i used in for loop*/
while(1)/*Infinite loop.The program will run forever*/
{
	for(i=0;i<10;i++)
	{
		P1=DIGIT[i];
		delay(100);/*All the values in the array is sent to P1 one by one*/
	}
}
}
void delay(int time)/*Start of delay() function. Delay() function generates delay of desired amount.*/
{
	int i,j;/*Initialize variable i,j for generating Delay*/
	for(i=0;i<=time;i++)/*Use Nested for loops to generate desired amount of delay.1ms delay by value stored in variable 'time'*/
	for(j=0;j<=1275;j++);/*this for loop generates delay of 1ms*/
}