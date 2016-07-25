class Rectangle
{
 int l;
 int b;
 Rectangle()
 {
  this.l=0;
  this.b=0;
 }
 Rectangle(int a)
 {
  this.l=a;
  this.b=a;
 }
 Rectangle(int a,int c)
 {
  this.l=a;
  this.b=c;
 }
 int area()
 {
  return l*b;
 }  
}
class RectDemo
{
 public static void main(String args[])
 {
   Rectangle r=new Rectangle(10,20);
   int area=r.area();
   System.out.println("Area of the rectangle is :- "+area);
 }
}