import java.io.*;
class SmallElement
{
  public static void main(String args[]) throws IOException
  {
    int a[]=new int[5];
    int i,small;
    BufferedReader in1=new BufferedReader(new InputStreamReader(System.in));
    for(i=0;i<a.length;i++)
    {
      System.out.print("Enter element no."+(i+1)+" :- ");
      a[i]=Integer.parseInt(in1.readLine()); 
    }
    small=a[0];
    for(i=1;i<a.length;i++)
    {
     if(small>a[i])
     {
      small=a[i];
     }
    }
    System.out.println("The smallest element is :- "+small);
  }
}