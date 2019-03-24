//practical-9b
#include<reg51.h>
//#include<standard.h>
#define Signal1 P1
#define Signal2 P2
void delayms(int count);
void main()
{
	while(1)
	{
		Signal1= 0x61;
		Signal2= 0x08;
		delayms(1000);
		Signal1 = 0xA2;
		Signal2 = 0x08;
		delayms(1000);
		Signal1 = 0x0C;
		Signal2 = 0x0C;
		delayms(1000);
		Signal1 = 0x14;
		Signal2 = 0x05;
		delayms(1000);
	}
}
void delayms( int count)
{
	int i,j;
	for(i=0;i<count;i++)
		for(j=0;j<1275;j++);
}
