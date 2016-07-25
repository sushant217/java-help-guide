import java.io.*;
class Box
{
  int l;
  int w;
  int h;
  Box()
  {
    l=0;
    w=0;
    h=0;
  }
  Box(int x)
  {
    l=x;
    w=x;
    h=x;
  }
  Box(int a,int b,int c)
  {
    l=a;
   w=b;
    h=c;
  }
  void readData() throws IOException
  {
     BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter length :- ");
     l=Integer.parseInt(in.readLine());
     System.out.println("Enter width :- ");
     w=Integer.parseInt(in.readLine());
     System.out.println("Enter height :- ");
     h=Integer.parseInt(in.readLine());
  }
  int calcVol()
  {
    int vol;
    vol=l*w*h;
    return vol;
  }
}
class BoxDemo
{
  public static void main(String args[]) throws IOException
  {
    int vol;
    Box b1=new Box();
    b1.readData();
    vol=b1.calcVol();
    System.out.println("The volume is :- "+vol);
  }
}