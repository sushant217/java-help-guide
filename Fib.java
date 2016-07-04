public class Fib{
public static void main(String args[])
{
int a=0,b=1,sum,n=10,i;
System.out.println(a);
System.out.println(b);
for(i=2;i<n;i++)
{
sum=a+b;
System.out.println(sum);
a=b;
b=sum;
}
}
}