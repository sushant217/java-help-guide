import java.io.*;
class Figure
{
 void area()
 {
  System.out.println("Calculating Area");
 }
}
class Rectangle extends Figure
{
 int l,b,area;
 Rectangle()
 {
  l=b=0; 
 }
 Rectangle(int x,int y)
 {
  l=x;
  b=y;
 }
 void area()
 {
  area=l*b;
 System.out.println("Area of rectangle = "+area); 
 }
}
class Triangle extends Figure
{
 int b,h;
 float area;
 Triangle()
 {
  b=h=0; 
 }
 Triangle(int x,int y)
 {
  b=x;
  h=y;
 }
 void area()
 {
  area=(float)0.5*b*h;
  System.out.println("Area of triangle = "+area); 
 }
}
class DynDisDemo
{
  public static void main(String args[]) throws IOException
  {
   int choice,l,b;
   Figure f=new Figure();
   BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Select from below :- \n1.Area of Rectangle\n2.Area of Triangle\nEnter choice :- ");
   choice=Integer.parseInt(in.readLine());
   if(choice==1)
   {
    System.out.println("Enter length");
    l=Integer.parseInt(in.readLine());
    System.out.println("Enter breadth");
    b=Integer.parseInt(in.readLine());
    f.area();
    f=new Rectangle(l,b);
    f.area();
   }
   else if(choice==2)
   {
    System.out.println("Enter Base");
    l=Integer.parseInt(in.readLine());
    System.out.println("Enter Height");
    b=Integer.parseInt(in.readLine());
    f.area();
    f=new Triangle(l,b);
    f.area();
   } 
  } 
}