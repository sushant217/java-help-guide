import java.util.Random;
class RandPrime
{
 public static void main(String a[])
 {
  int flag=1,i,num;
  Random r1=new Random();
  num=1+r1.nextInt(100);
  System.out.println("The randomly generated no. is :- "+num);
  for(i=2;i<num;i++)
  {
   if(num%i==0)
   {
    flag=0;
    break;
   }
  }
  if(flag==1&&num!=1)
  System.out.println("Its a prime no. ");
  else
  System.out.println("Its not a prime no. ");
 }
}