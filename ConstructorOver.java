class A 
{
public A(String name,int age)
{
System.out.print("name is:" +name);
System.out.print("\nage is:" +age);
}
public A()
{
System.out.print("\n this is perameterless constructor");
}
}
class ConstructorOver{
public static void main(String[]args)
{
A ob=new A("sneha",10);
}
}