import java.io.*;
class Calc
{
  public static void main(String args[]) throws IOException
  {
   int ch,a,b;
   float result;
   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Select Operation to be performed:-");
   System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
   ch=Integer.parseInt(in.readLine());
   if(ch>0&&ch<5)
   {
     System.out.println("Enter num1 :- ");
     a=Integer.parseInt(in.readLine());
     System.out.println("Enter num2 :- ");
     b=Integer.parseInt(in.readLine());
     if(ch==1)
     result=a+b;
     else if(ch==2)
     result=a-b;
     else if(ch==3)
     result=a*b;
     else
     result=(float)a/b;
     System.out.println("The result is :- "+result);
   } 
   else
   {
    System.out.println("Invalid Choice!!!");
   }

  }
}