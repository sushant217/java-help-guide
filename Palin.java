public class Palin{
public static void main(String args[])
{
int num=545,temp,rev,sum=0;
temp=num;
while(num>0)
{
rev=num%10;
sum=(sum*10)+rev;
num=num/10;
}
if(temp==sum)
System.out.println("palindrome number ");
else
System.out.println("Not palindrome number ");
}}