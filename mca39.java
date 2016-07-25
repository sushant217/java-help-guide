import java.io.*;
class AgeExcep extends Exception
{
 AgeExcep(){};
}
class Voter
{
 String vname;
 int age;
 Voter()
 {
  vname="NO NAME";
  age=0;
 }
 void readVal() throws IOException,AgeExcep
 {
  BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter name:- ");
  vname=in.readLine();
  System.out.println("Enter age :- ");
  age=Integer.parseInt(in.readLine());
  if(age<18)
  throw new AgeExcep();
 }
 void showData()
 {
  System.out.println("Name= "+vname);
  System.out.println("Age= "+age+"\nVoter is Valid!!!");
 }
}
class VoterDemo
{
 public static void main(String a[])throws IOException
 {
   Voter v1=new Voter();
   try
   {
    v1.readVal();
    v1.showData();
   }
   catch(AgeExcep ae)
   {
     System.out.println("Age cannot be less than 18");
   }
 }
}