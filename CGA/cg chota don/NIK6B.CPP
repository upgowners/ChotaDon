#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void main()
{
	float x1,y1,x2,y2,sx,sy;
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"C:\\TC\\BGI");
	printf("Enter the start coordinates(x1,y1):\t");
	scanf("%f%f",&x1,&y1);
	printf("Enter the end coordinates(x2,y2):\t");
	scanf("%f%f",&x2,&y2);
	rectangle(x1,y1,x2,y2);
	printf("\nEnter the scaling parameters:\t");
	scanf("%f%f",&sx,&sy);
	printf("\n\nLine after scaling");
	x1=x1*sx;
	y1=y1*sy;
	x2=x2*sy;
	y2=y2*sy;
	rectangle(x1,y1,x2,y2);
	getch();
	closegraph();
}
