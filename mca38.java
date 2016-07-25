import java.io.*;
class BalExcep extends Exception
{
 BalExcep(){};
}
class Customer
{
 String cname;
 float bal;
 Customer()
 {
  cname="NO NAME";
  bal=0;
 }
 void readVal() throws IOException,BalExcep
 {
  BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter name:- ");
  cname=in.readLine();
  System.out.println("Enter balance :- ");
  bal=Float.parseFloat(in.readLine());
  if(bal<0)
  throw new BalExcep();
 }
 void showData()
 {
  System.out.println("Name= "+cname);
  System.out.println("Balace= "+bal);
 }
}
class CustDemo
{
 public static void main(String a[])throws IOException
 {
   Customer c1=new Customer();
   try
   {
    c1.readVal();
    c1.showData();
   }
   catch(BalExcep be)
   {
     System.out.println("Balance Cannot Be Negative");
   }
 }
}