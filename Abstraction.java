abstract class camera
{
abstract public void a();
abstract public void b();
public void c()
{
System.out.println("nikon");
}
}
class canon extends camera
{
public void a()
{
System.out.println("lens");
}
public void b()
{
System.out.println("zoom");
}
}
class Abstraction
{
public static void main(String[]args)
{
canon ob=new canon();
ob.a();
ob.b();
ob.c();
}
}
