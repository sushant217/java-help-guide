import java.io.*;
abstract class Figure
{
 abstract float area();
}
class Rect extends Figure
{
 int l,b;
 Rect(int x,int y)
 {
  l=x;
  b=y;
 }
 float area()
 {
  return l*b;
 }
}
class Trian extends Figure
{
 int b,h;
 Trian(int x,int y)
 {
  b=x;
  h=y;
 }
 float area()
 {
  return ((float)0.5*b*h);
 }
}
class AbsDemo
{
 public static void main(String ar[]) throws IOException
 {
   int choice=0,a,b;
   float area;
   BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Select from below :- \n1.Area of Rectangle\n2.Area of Triangle\n");
   System.out.println("Enter choice  :- ");
   choice=Integer.parseInt(in.readLine());
   if(choice==1)
   {
    System.out.println("Enter length :- ");
    a=Integer.parseInt(in.readLine());
    System.out.println("Enter breadth :- ");
    b=Integer.parseInt(in.readLine());
    Rect r1=new Rect(a,b);
    area=r1.area();
    System.out.println("Area of Rectangle = "+area);
   }
   else if(choice==2)
   {
    System.out.println("Enter base :- ");
    a=Integer.parseInt(in.readLine());
    System.out.println("Enter height :- ");
    b=Integer.parseInt(in.readLine());
    Trian t1=new Trian(a,b);
    area=t1.area();
    System.out.println("Area of Triangle = "+area);
   }
 }
}
