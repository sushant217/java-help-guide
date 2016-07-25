import java.io.*;
class FindSurname
{
  public static void main(String args[]) throws IOException
  {
    String name;
    int i=0,index;
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter name :- ");
    name=in.readLine();
    index=name.lastIndexOf(" ");
    index++;
    System.out.println("The surname is :- " + name.substring(index));
  }
}