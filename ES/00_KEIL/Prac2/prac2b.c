//practical-2b

#include<reg51.h>
void delayms(int time);
void main()
{
	while(1)
	{
		P1=0xFF;
		delay(100);
		P2=P1;
	}	
}
void delayms(int time)
{
	int i,j;
	for(i=0;i<time;i++)
		for(j=0;j<=23;j++);
} 