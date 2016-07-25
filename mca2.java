import java.io.*;
class AreaCircle
{
 public static void main(String args[]) throws IOException
 {
  float area,rad;
  BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter radius of circle :- ");
  rad=Float.parseFloat(in.readLine());
  area=(float)3.14*rad*rad;
  System.out.println("Area = "+area);
 }
}