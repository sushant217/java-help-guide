import java.io.*;
class MatOp
{
  public static void main(String a[]) throws IOException
  {
   int[][]m1=new int[3][3];
   int[][]m2=new int[3][3];
   int[][]m3=new int[3][3];
   int i,j,k,op,flag=0;
   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("First Matrix :- ");
   for(i=0;i<3;i++)
   {
     for(j=0;j<3;j++)
     {
       System.out.print("Enter element no. "+i+j+" :- ");
       m1[i][j]=Integer.parseInt(in.readLine());
     }
   }
   System.out.println("Second Matrix :- ");
   for(i=0;i<3;i++)
   {
     for(j=0;j<3;j++)
     {
       System.out.print("Enter element no. "+i+j+" :- ");
       m2[i][j]=Integer.parseInt(in.readLine());
     }
   }
   System.out.println("Select operation");
   System.out.println("1.Addition\n2.Subtraction\n3.Multiplication"); 
   op=Integer.parseInt(in.readLine());
   if(op==1)
   {
     for(i=0;i<3;i++)
     {
      for(j=0;j<3;j++)
      {
        m3[i][j]=m1[i][j]+m2[i][j];
      }
     }
   }
   else if(op==2)
   {
     for(i=0;i<3;i++)
     {
      for(j=0;j<3;j++)
      {
        m3[i][j]=m1[i][j]-m2[i][j];
      }
     }
   }
   else if(op==3)
   {
     for(i=0;i<3;i++)
     {
      for(j=0;j<3;j++)
      {
       m3[i][j]=0;
       for(k=0;k<3;k++)
       {
         m3[i][j]+=m1[i][k]*m2[k][j];
       }
      }
     }
   }
   else
   {
     System.out.println("Wrong Operation");
     flag=1;
   }
   if(flag==0)
   {
     System.out.println("First Matrix :- ");
     for(i=0;i<3;i++)
     {
      for(j=0;j<3;j++)
      {
        System.out.print(m1[i][j]+"   ");
      }
      System.out.println();
     }
     System.out.println("Second Matrix :- ");
     for(i=0;i<3;i++)
     {
      for(j=0;j<3;j++)
      {
        System.out.print(m2[i][j]+"   ");
      }
      System.out.println();
     }
     System.out.println("Result Matrix :- ");
     for(i=0;i<3;i++)
     {
      for(j=0;j<3;j++)
      {
        System.out.print(m3[i][j]+"   ");
      }
      System.out.println();
     }
   }
   
  }
}