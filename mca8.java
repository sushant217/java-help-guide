import java.util.Random;
class RandArm
{
 public static void main(String a[])
 {
  int flag=1,i,num,rem,sum=0,num1=0;
  Random r1=new Random();
  num=1+r1.nextInt(500);
  num1=num;
  System.out.println("The randomly generated no. is :- "+num);
  while(num>0)
  {
    rem=num%10;
    sum=sum+(rem*rem*rem);
    num=(int)num/10;
  }
  if(sum==num1)
  System.out.println("Its a armstrong no. ");
  else
  System.out.println("Its not a armstrong no. ");
 }
}