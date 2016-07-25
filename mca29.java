import java.io.*;
class Box2
{
int height,width,depth;
 Box2()
 {
  height=0;
  width=0;
  depth=0; 
 }
 Box2(int x,int y,int z)
 {
  height=x;
  width=y;
  depth=z; 
 }
}

class BoxWeight1 extends Box2
{
 int weight;
 int volume;
 BoxWeight1()
 {
  super(); 
  weight=0;
 }
 BoxWeight1(int x,int y,int z,int n)
 {
  super(x,y,z); 
  weight=n;
 }
 void calcVolume()
 {
  volume=height*width*depth;
 }
 void print()
 {
  System.out.println("Volume = "+volume+" Weight= "+weight+"Kg");
 }
}
class BoxDemo2
{
  public static void main(String a[]) throws IOException
  {
    int h,w,d,we;
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter height :- ");
    h=Integer.parseInt(in.readLine());  
    System.out.println("Enter width :- ");
    w=Integer.parseInt(in.readLine());  
    System.out.println("Enter depth :- ");
    d=Integer.parseInt(in.readLine());  
    System.out.println("Enter Weight(In KG) :- ");
    we=Integer.parseInt(in.readLine());  
    BoxWeight1 bw=new BoxWeight1(h,w,d,we);
    bw.calcVolume();
    bw.print();   
  }
}