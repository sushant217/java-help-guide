class Test
{
 int a,b;
 Test()
 {
  a=10;
  b=20;
 }
 void swap(Test t)
 {
  int temp;
  temp=t.a;
  t.a=t.b;
  t.b=temp; 
 }
 void Display()
 {
  System.out.println("A="+a+" B= "+b+"\n");
 }
}
class RefVarDemo
{
  public static void main(String args[])
  {
   Test to=new Test();
   to.Display();
   to.swap(to);
   to.Display();    
  }
}