#include<reg51.h>

void Delayms(unsigned int count);
sbit RED=P1^0;
sbit YELLOW= P1^1;
sbit GREEN= P1^2;
void main()
{
	while(1)
	{
		RED=1;
		Delayms(1000);
		GREEN=1;
		Delayms(1000);
		YELLOW=1;
		Delayms(1000);
	}
}
void Delayms(unsigned int count)
{
	int i,j;
	for(i=0;i<count;i++)
		for(j=0;j<1275;j++);
}