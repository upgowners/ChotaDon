#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void main()
{
int gd=DETECT,gm;
int x,y,z,length=200,breadth=200;
initgraph(&gd,&gm,"C:\\TC\\BGI");
setcolor(WHITE);
x=getmaxx()/2;
y=getmaxy()/2;
outtextxy(x-100,50,"square");
rectangle(x-length/2,y-breadth/2,x+length/2,y+breadth/2);
setfillstyle(SOLID_FILL,RED);
floodfill((x-length/2)+2,(y-breadth/2)+2,WHITE);
getch();
closegraph();
}