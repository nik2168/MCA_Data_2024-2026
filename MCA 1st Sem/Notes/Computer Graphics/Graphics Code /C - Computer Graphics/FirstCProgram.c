#include<stdio.h>
#include<conio.h>
#include<graphics.h>

void main(){
    clrscr()
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "");
    setbkcolor(RED);
    line(50,40,190,40);
    getch();
}