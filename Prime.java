public class Prime{
public static void main(String args[])
{
int n=17,i,count=0;
for(i=2;i<n;i++)
{
	if(n%2==0)
	{
	count++;
	}
}
if(count>0)
System.out.println("NOT A PRIME");
else
System.out.println("Is A PRIME");
}
}