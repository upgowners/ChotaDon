#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void main()
{
int gd=DETECT,gm;
int x,y,z;
initgraph(&gd,&gm,"C:\\TC\\BGI");
setcolor(WHITE);
x=getmaxx()/2;
y=getmaxy()/2;
settextstyle(TRIPLE_FONT,HORIZ_DIR,2);
outtextxy(x-100,20,"cocentric circle");
//circle(x,y,25);
//circle(x,y,50);
//circle(x,y,75);
setfillstyle(SOLID_FILL,9);
fillellipse(x,y,75,75);
setfillstyle(SOLID_FILL,3);
fillellipse(x,y,50,50);
setfillstyle(SOLID_FILL,1);
fillellipse(x,y,25,25);
getch();
closegraph();
}