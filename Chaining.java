class A
{
public A()
{
System.out.print ("\nHi");
}
}
class B extends A
{
public B()
{
System.out.print("\nThis is Shubhangi Shukla");
}
public B(int x)
{
super();
System.out.print("Lives in Kanpur");
}
}
class C extends B
{
public C()
{
super();
System.out.print("\nI love my family");
}
}
class Chaining
{
public static void main(String []args)
{
C ob=new C();
}
}