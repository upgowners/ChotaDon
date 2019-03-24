#include<graphics.h>
#include<conio.h>
#include<stdio.h>
void main()
{
	int gd=DETECT,gm;
	int x,y,length,breadth;
	initgraph(&gd,&gm,"C:\\TC\\BGI");
	setcolor(WHITE);
	x=getmaxx();
	y=getmaxy();
	line(x/2,0,x/2,y);
	line(0,y/2,x,y/2);
	outtextxy(100,50,"rectangle!");
	rectangle(50,160,220,90);
	outtextxy(130,260,"circle!");
	circle(150,350,50);
	outtextxy(370,100,"ellipse!");
	ellipse(500,150,0,360,100,50);
	outtextxy(400,280,"half ellipse!");
	ellipse(460,350,0,180,100,50);
	getch();
	closegraph();
}
