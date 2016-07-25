import java.io.*;
class Area
{
 float calcArea(int r)
 {
  return (float)3.14*r*r;  
 }
 int calcArea(int a,int b)
 {
  return a*b;
 }
}
class AreaDemo
{
 public static void main(String a[]) throws IOException
 {
  int choice,flag=0;
  float area=0;
  Area a1=new Area();
  BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Select from below :- ");
  System.out.println("1.Area of Circle\n2.Area Of Rectangle\n Enter choice :- ");
  choice=Integer.parseInt(in.readLine());
  if(choice==1)
  {
   int rad;
   System.out.println("Enter radius :- ");
   rad=Integer.parseInt(in.readLine());
   area=a1.calcArea(rad);  
  }
  else if(choice==2)
  {
   int l,b;
   System.out.println("Enter length :- ");
   l=Integer.parseInt(in.readLine());
   System.out.println("Enter breadth :- ");
   b=Integer.parseInt(in.readLine());
   area=a1.calcArea(l,b);
  }
  else
  {
   System.out.println("Wrong Choice");
   flag=1;
  }
  if(flag==0)
  {
   System.out.println("The area is :- "+area);
  }
 }
}