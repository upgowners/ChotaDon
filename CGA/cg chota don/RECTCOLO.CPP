#include<graphics.h>
#include<conio.h>
void main()
{
	int gd=DETECT,gm;
	int x,y;
	initgraph(&gd,&gd,"C:\\TC\\BGI");
	setcolor( BLUE);
	x=getmaxx()/2;
	outtextxy(x-100,50,"Rectangle");
	rectangle(200,160,420,300);
	setfillstyle(SOLID_FILL,RED);
	floodfill(202,162,BLUE);
	getch();
	closegraph();
}

