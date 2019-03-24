#include<graphics.h>
#include<conio.h>
#include<stdio.h>
void main()
{
	float x1,y1,r,tx,ty;
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"C:TURBOC4\\TC\\BGI");
	printf("\nEnter start coordinates(x1,y1):");
	scanf("%f%f",&x1,&y1);
	printf("Enter the radius:");
	scanf("%f%f",&r);
	ellipse(x1,y1,r);
	printf("Enter the translation parameters:");
	scanf("%f%f",&tx,&ty);
	printf("Ellipse after translating:");
	x1=x1*sx;
	y1=y1*sy;
	circle(x1,y1,r);
	getch();
	closegraph();
}