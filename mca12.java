import java.io.*;
class LinearSearch
{
  public static void main(String args[]) throws IOException
  {
    int a[]=new int[5];
    int i,n,flag=0;
    BufferedReader in1=new BufferedReader(new InputStreamReader(System.in));
    for(i=0;i<a.length;i++)
    {
      System.out.print("Enter element no."+(i+1)+" :- ");
      a[i]=Integer.parseInt(in1.readLine()); 
    }
    System.out.print("Enter element to be searched :- ");
    n=Integer.parseInt(in1.readLine());
    for(i=0;i<a.length;i++)
    {
     if(a[i]==n)
     {
       System.out.println("Element found at position :- "+(i+1));
       flag=1;
     }
    }
    if(flag==0)
    {
    System.out.println("Element not found!!!");
    }
  }
}