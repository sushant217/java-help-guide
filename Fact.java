public class Fact{
static int facts(int n)
{
if(n==0)
return(1);
else
return(n*facts(n-1));
}

public static void main(String args[])
{
int factt=1,num=4;
factt=facts(num);
System.out.println(""+factt);
}
}