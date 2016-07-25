import java.io.*;
class GradeStu
{
  public static void main(String args[]) throws IOException
  {
    float per;
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    per=0.0F;
    System.out.println("Enter percentage :- ");
    per=Float.parseFloat(in.readLine());
    if(per>=0&&per<=100)
    {
     if(per>90)
     System.out.println("Grade is A");
     else if(per>75)
     System.out.println("Grade is B");
     else if(per>60)
     System.out.println("Grade is C");
     else if(per>=50)
     System.out.println("Grade is D");
     else
     System.out.println("FAIL");
    }
    else
    {
     System.out.println("Invalid Percentage");
    }
  }
}