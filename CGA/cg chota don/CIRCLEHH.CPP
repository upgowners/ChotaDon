#include<graphics.h>
#include<conio.h>
#include<stdio.h>
void main()
{
	  int gd=DETECT,gm;
	  int x,y,length=100,breadth=200;
	  initgraph(&gd,&gm,"C:\\TC\\BGI");
	  setcolor(GREEN);
	  x=getmaxx();
	  y=getmaxy();
	  outtextxy(200,50,"Rectangle");
	  rectangle(400,250,500,400);
	  circle(500,100,100);
	  line(x/2,0,x/2,y);
	  line(0,y/2,x,y/2);
	  ellipse(100,100,0,360,70,100);
	  ellipse(100,300,0,180,100,50);
	  getch();
	  closegraph();
}