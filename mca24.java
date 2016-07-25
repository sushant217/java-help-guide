class Triangle
{
 int b;
 int h;
 Triangle(int x,int y)
 {
  b=x;
  h=y;
 }
 float area()
 {
  return (float)0.5*b*h;
 }
}
class TrianDemo
{
 public static void main(String args[])
 {
  Triangle t1=new Triangle(20,30);
  float area;
  area=t1.area();
  System.out.println("The area of the triangle is :- "+area);
 }
}