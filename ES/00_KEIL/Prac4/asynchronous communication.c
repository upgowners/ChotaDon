/* The program send characters "YES" to PC with baud rate of 9600 using serial Communication */
#include<reg51.h>
void send(char x);

void main(void)
{
	TMOD=0x20;

	TH1=0xFD;

	SCON=0x50;

	TR1=1;
	send('Y');
	send('E');
	send('S');
	send('\r');
	while(1);
}
void send(char x)
{
	SBUF=x;
	while(TI==0);
	TI=0;
}