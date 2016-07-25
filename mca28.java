import java.io.*;
class Box1
{
int height,width,depth;
}

class BoxWeight extends Box1
{
 int weight;
 int volume;
 BoxWeight()
 {
  height=0;
  width=0;
  depth=0; 
  weight=0;
 }
 BoxWeight(int x,int y,int z,int n)
 {
  height=x;
  width=y;
  depth=z; 
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
class BoxDemo1
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
    BoxWeight bw=new BoxWeight(h,w,d,we);
    bw.calcVolume();
    bw.print();   
  }
}