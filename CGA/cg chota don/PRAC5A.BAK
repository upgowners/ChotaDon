#include<graphics.h>
#include<conio.h>
#include<stdio.h>
void main()
{
	int gd=DETECT,gm;
	int i,r,x=0,y,xc,yc;
	float d;
	clrscr();
	initgraph(&gd,&gm,"c:\\tc\\BGI");
	printf("Enter Radius\n");
	scanf("%d",&r);
	printf("Enter Center of circle\n");
	scanf("%d",&xc);
	scanf("%d",&yc);
	d=1.25-r;
	y=r;
	do
	{
		if(d<0.0)
		{
			x=x+1;
			d=d+2*x+1;
		}
		else
		{
			x=x+1;
			y=y-1;
			d=d+2*x-2*y+10;
		}
		putpixel(xc+x,yc+y,5);
		putpixel(xc-y,yc-x,5);
		putpixel(xc+y,yc-x,5);
		putpixel(xc-y,yc+x,5);
		putpixel(xc+y,yc+x,5);
		putpixel(xc-x,yc-y,5);
		putpixel(xc+x,yc-y,5);
		putpixel(xc-x,yc+y,5);
		}while(x<y);
	getch();
	}
