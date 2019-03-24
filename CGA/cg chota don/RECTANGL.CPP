#include<graphics.h>
#include<conio.h>
#include<stdio.h>
void main()
{
	int gd=DETECT,gm;
	initgraph(&gm,&gd,"C:\\TURBOC3\\BGI");
	setcolor(WHITE);
	rectangle(150,180,250,300);
	rectangle(250,189,420,300);
	getch();
	closegraph();
}
