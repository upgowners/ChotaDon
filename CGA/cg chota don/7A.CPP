#include<stdio.h>
#include<math.h>
#include<conio.h>
#include<graphics.h>
void main()
{
	clrscr();
	int gd =DETECT,gm;
	int x1,x2,y1,y2,a;
	float t;
	initgraph(&gd,&gm,"C:\\TURBOC#\\BGI");
	printf("\n Enter the co-ordinate(x1,y2)");
	scanf("%d%d",&x1,&y1);
	printf("\n Enter the co-ordinate (x2,y2)");
	scanf("%d%d",&x2,&y2);
	printf("Enter the angle of rotation:");
	scanf("%d",&a);
	line(x1,y1,x2,y2);
	printf("%d%d%d%d",x1,x2,y1,y2);
	outtextxy(x2+5,y2+7,"Original line");
	t=a*(3.14/180);
   //	x1=(x1*cos(t))-(y1*sin(t));
	x2=(x2*cos(t))-(y2*sin(t));
   //	y1=(x1*sin(t))+(y1*cos(t));
	y2=(x1*sin(t))+(y1*cos(t));
	line(x1,y1,x2,y2);
	outtextxy(x2+5,y2+7,"line after rotation") ;
	getch();
	closegraph();
}