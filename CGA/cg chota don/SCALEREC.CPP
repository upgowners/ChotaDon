#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void main()
{
	int gd=DETECT,gm;
	int x1,y1,x2,y2,sx,sy;
	initgraph(&gd,&gm,"C:\\TC\\BGI");
	printf("\nenter top and left co ordinates (x1,y1):");
	scanf("%d %d",&x1,&y1);
	printf("\nenter bottom and right coordinates(x2,y2):");
	scanf("%d %d",&x2,&y2);
	rectangle(x1,y1,x2,y2);
	printf("\n\n\nenter scaling parameters:");
	x1=x1*sx;
	y1=y1*sy;
	x2=x2*sx;
	y2=y2*sy;
	rectangle(x1,y1,x2,y2);
	getch();
	closegraph();

}