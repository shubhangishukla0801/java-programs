class Box
{
int h;
int w;
int l;
Box()
{
}
}

class BoxTest
{
public static void main(String args[])
{
Box b1=new Box();
b1.h=40;
b1.w=60;
b1.l=5;
System.out.println(b1.h);
System.out.println(b1.w);
System.out.println(b1.l);
}
}