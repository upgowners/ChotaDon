#include<reg51.h>
sbit flag=P2^0;
void delay();
void main()
{
	if(flag==0)
	{
		P1=0x03;
		delay();
		P1=0x06;
		delay();
		P1=0x0C;
		delay();
		P1=0x18;
		delay();
	}
	else
	{
		P1=0x18;
		delay();
		P1=0x0C;
		delay();
		P1=0x06;
		delay();
		P1=0x03;
		delay();
	}
}
void delay()
{
	int i,j;
	for(i=0;i<=1000;i++)
		for(j=0;j<=1275;j++);
}