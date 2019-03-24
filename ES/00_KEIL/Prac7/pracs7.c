 #include<reg51.h>
void delay(void);
void send(char x);
unsigned char nalaram[]={"under control \n"};
unsigned char alaram[]={"need to control \n"};
unsigned int i;
void main(void)
{
	TMOD=0x20;
	TH1=0xFD;
	SCON=0x50;
	TR1=1;
	while(1)
	{
		if(P1>0x05)
		{
			for(i=0;i<17;i++)
			{
				send(alaram[i]);
			}
			P2=0xFF;
			delay();
			P2=0x00;
			delay();
		}
		else
		{
			for(i=0;i<14;i++)
			{
				send(nalaram[i]);
			}
			P3=0x55;
		}
	}
}
void delay(void)
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
