public class Arm{
public static void main(String args[])
{
int val,sum=0,num=113;
int temp=num;
while(temp>0)
{
val=temp%10;
sum=sum+val*val*val;
temp=temp/10;
}
if(sum==num)
System.out.println("Armstrong");
else
System.out.println("Not Armstrong");
}
}
