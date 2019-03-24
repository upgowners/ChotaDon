#include<stdio.h>
#include<graphics.h>
#include<conio.h>
#include<math.h>

#define PI 3.14
void main()
{
	int driver=DETECT, gmode;
	int x1, y1, x2, y2;
	float x1new, y1new, x2new, y2new;
	float r=70;
	float theta;
	fflush(stdin);

	detectgraph(&driver, &gmode);
	initgraph(&driver, &gmode,"C:\\TC\\BGI");

	printf("Enter the coordinates of line");
	scanf("%d %d %d %d",&x1,&y1,&x2,&y2);

	printf("Enter the rotation angle:");
	scanf("%f",&r);

	theta=r*PI/180;
	x1new=x1; y1new=y1;
	x1new=abs(x1*cos(theta)-y1*sin(theta));
	y1new=abs(x1*sin(theta)+y1*cos(theta));

	x2new=abs(x2*cos(theta)-y2*sin(theta));
	y2new=abs(x2*sin(theta)+y2*cos(theta));

	printf("x1=%d, y1=%d, x2=%d, y2=%d",x1,y1,x2,y2);
	printf("\nx1new=%f, y1new=%f, x2new=%f, y2new=%f",x1new,y1new,x2new,y2new);

	line(x1,y1,x2,y2);

	line(x1new,y1new, x2new,y2new);
	getch();

}
