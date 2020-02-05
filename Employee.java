class Employee
{
String name,post,city;
int pin, basicsal,TA,DA,Totalsal;
public void empDetail (String n,String p,String c,int pi)
{
name=n;
post=p;
city=c;
pin=pi;
}
public void empSalary(int bs,int ta,int da,int ts)
{
basicsal=bs;
TA=ta;
DA=da;
Totalsal=ts;
}
public void showDetail()
{
System.out.print("\nname:" +name);
System.out.print("\nPost:" +post);
System.out.print("\ncity:" +city);
System.out.print("\npin:" +pin);
}
public void showSalary()
{
System.out.print("\nBasicsal:" +basicsal);
System.out.print("\nTA:" +TA);
System.out.print("\nDA:" +DA);
System.out.print("\nTotalsal:" +Totalsal);
}
}
public class Employee
{
public static void main (String []args)
{
Employee ob=new Employee();
ob.empDetail("shubh","manager","pune",206758);
ob.empSalary(20000,30000,50000,100000);
ob.showDetail();
ob.showSalary();
}

}

