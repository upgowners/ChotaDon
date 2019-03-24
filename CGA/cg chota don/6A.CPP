#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void main()
{
	int x1,y1,x2,y2,sx,sy;
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"C:\\Turboc4\\TC\\BGI");
	printf("\nEnter starting coordinates(x1,y1):\t");
	scanf("%d%d",&x1,&y1);
	printf("\nEnter end coordinates(x2,y2):\t");
	scanf("%d%d",&x2,&y2);
	line(x1,y1,x2,y2);
	printf("\nEnter scaling parameters:\t");
	scanf("%d%d",&sx,&sy);
	printf("\nLine after scaling:\t");
	x1=x1*sx;
	y1=y1*sy;
	x2=x2*sx;
	y2=y2*sy;
	line(x1,y1,x2,y2);
	getch();
	closegraph();
}


