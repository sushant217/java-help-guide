import java.io.*;
class ArraySort
{
  public static void main(String args[]) throws IOException
  {
    int a[]=new int[5];
    int i,j,temp;
    BufferedReader in1=new BufferedReader(new InputStreamReader(System.in));
    for(i=0;i<a.length;i++)
    {
      System.out.print("Enter element no."+(i+1)+" :- ");
      a[i]=Integer.parseInt(in1.readLine()); 
    }
    for(i=0;i<a.length;i++)
    {
      for(j=0;j<a.length;j++)
      {
       if(a[i]<a[j])
       {
         temp=a[i];
         a[i]=a[j];
         a[j]=temp;
       }
      }
    }
    System.out.println("Elements in ascending order are :- ");
    for(i=0;i<a.length;i++)
    {
     System.out.println(a[i]); 
    }
    System.out.println("Elements in descending order are :- ");
    for(i=(a.length-1);i>=0;i--)
    {
     System.out.println(a[i]); 
    }
  }
}