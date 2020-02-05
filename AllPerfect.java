public class AllPerfect
{
public static void main (String[] args)
{
int i,j,sum;
for (j=1;j<=100;j++)
{
sum=0;
for (i=1;i<j;i++)
{
if(j%i==0)
sum=sum+i;
}
if(sum==j)
System.out.print (j);
}
}
}
