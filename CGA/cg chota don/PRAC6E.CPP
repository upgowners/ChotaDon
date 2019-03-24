#include<graphics.h>
#include<conio.h>
#include<stdio.h>
void main()
{
	float x1,x2,y1,y2,,x3,y3,tx,ty;
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"C:TURBOC4\\TC\\BGI");
	printf("\nEnter start coordinates(x1,y1):");
	scanf("%f%f",&x1,&y1);
	printf("\nEnter the end coordinates(x2,y2):");
	scanf("%f%f",&x2,&y2);
	printf("Enter the third coordinates(x3,y3):");
	scanf("%f%f",&x3,&y3);
	line(x1,y1,x2,y2,x3,y3);
	printf("Enter the translation parameters:");
	scanf("%f%f",&tx,&ty);
	printf("Line after scaling:");
	x1=x1+tx;
	y1=y1+ty;
	x2=x2+tx;
	y2=y2+ty;
	x3=x3+tx;
	y3=y3+ty;
	line(x1,y1,x2,y2,x3,y3);
	getch();
	closegraph();
}