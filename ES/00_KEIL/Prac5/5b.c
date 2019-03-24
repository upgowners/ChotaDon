#include<reg51.h>
#include<intrins.h>
void main()
{
	int WAVEVALUE[12]={128,192,238,255,238,192,128,64,17,0,17,64};
	int i;
	while(1)
	{
			for(i=0;i<12;i++)
			{
				P1=WAVEVALUE[i];
				_nop_();
				_nop_();
				_nop_();
				_nop_();
				_nop_();
				_nop_();
			}
	}


}