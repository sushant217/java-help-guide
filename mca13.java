import java.io.*;
class BinSearch
{
  public static void main(String args[]) throws IOException
  {
    int a[]=new int[5];
    int i,j,temp,n,lb,ub,mid,flag=0;
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
    System.out.print("Enter element to be searched :- ");
    n=Integer.parseInt(in1.readLine());
    lb=0;
    ub=4;
    mid=(lb+ub)/2;
    while(lb<=ub)
    {
     if(a[mid]==n)
     {
      System.out.println("Element found at position :- "+(mid+1));
      flag=1;
      break;
     }
     else
     {
      if(n>a[mid])
       lb=mid+1;
      else
       ub=mid-1;
     }
     mid=(lb+ub)/2;
    }
    if(flag==0)
    System.out.println("Element not found !!");
  }
}