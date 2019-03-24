#include<reg51.h>
void delay(int time); // delay() prototype,this functn generates delay=(time x 1 msec)
/* Eg: delay(500). 
	Generates delay of (500 x 1 msec)=500 msec */
void main()
{
	P1=00000000; // Initialize port 1 as output
	while(1)    //  Infinite Loop
	{
		P1++; //Increment port 1(Binary Counter)
		delay(1000);// call delay().Add Some delay for output 
//LED to generate 1 sec delay pass value 1000
// i.e 1000 x 1 msec =1 sec 
	}
} // End of Main
void delay(int time) // Generates a Delay of Desired Amount
{
	int i,j;    // Initialize variable i,j for Generating Delay
	for(i=0;i<=time;i++)
	{
		for(j=0;j<=1275;j++); // This for loop generates Delay of 1millisecond
		
	}	
}