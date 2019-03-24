#include<reg51.h>
void delay(int time); //delay() function prototype,this function generates delay=(time*1msec)
void main()
{
	P1=0x00;
	while(1)
	{
		P1=0xFF;
		delay(1);
		P1=0x00;
		delay(1);
	}
}
void delay(int time)
{
	int i,j;
	for(i=0;i<=time;i++)
		for(j=0;j<=time;j++);
}