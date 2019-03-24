#include<reg51.h>
unsigned int i;
void delay();
void send(char x);
void main(void)
{
	unsigned int z;
	TMOD=0x20;
	TH1=0xF4;
	SCON=0x50;
	TR1=1;
	while(1)
	{
		z=P1;
		switch(z)
		{
			case(1):
			{
				send('1');
				P2=0x66;
				delay();
				break;
			}
			case(2):
			{
				send('2');
				P2=0xCC;
				delay();
				break;
			}
			case(3):
			{
				send('3');
				P2=0x99;
				delay();
				break;
			}
			case(4):
			{
				send('4');
				P2=0x33;
				delay();
				break;
			}
		}
	}
}
void delay()
{
	unsigned int i;
	for(i=0;i<=40000;i++);
}
void send(char x)
{
	SBUF=x;
	while(TI==0);
	TI=0;
}