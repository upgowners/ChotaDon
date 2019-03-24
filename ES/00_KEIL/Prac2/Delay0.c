#include<reg51.h> // Define Variables & SFR
//#include<standard.h>
void Delayms(void); // Time 0,Mode 1(16 bit Timer)
sbit OUTPUT =P1^0; // Initialize port pin P1.0 as O/P
void main()
{
	while(1)
	{
		OUTPUT=0; //Make P1.0 low
		Delayms(); //Delay of 50 usec
		OUTPUT=1; //MAke P1.0 high
		Delayms(); //Delay of 50 usec
	}
}
void Delayms()
{
	TMOD=0x01; //Timer 0 Model (16 bit Timer)
	TL0=0x3C;  //Load TL0=3C H
	TH0=0xB0;  //Load TH0=B0 H
	TR0=1;    // Run Timer 0
	
	while(TF0==0)  // wait 4 TF0 to overflow
		TR0=0;   //Stop Timer
		TF0=0;   // clear TF0
		
}