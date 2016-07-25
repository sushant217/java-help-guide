class UseStatic
{
static int a=10,b=20;
static void func()
{
System.out.println("A= "+a+" B= "+b);
}
static
{
 a=a+5;
 b=b/2;
}
}
class StatDemo
{
 public static void main(String args[])
 {
  UseStatic.func();
 }
}