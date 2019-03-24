#include<graphics.h>
#include<conio.h>
#include<stdio.h>
void main()
{
	int gd=DETECT,gm;
	int x,y;
	initgraph(&gd,&gm,"C:\\TC\\BGI");
	setcolor(GREEN);
	x=getmaxx()/2;
	y=getmaxy()/2;
	outtextxy(200,50,"Rectangle");
	//rectangle(250,100,350,300);
	//rectangle(x-100,y-50,x+100,y+50)
	rectangle(x-length/2/y-breadth/2,x+length/2/y+breadth/2,)
	getch();
	closegraph();
}