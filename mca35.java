interface Stack
{
 void push(int item);
 void pop();
}
class MyStack implements Stack
{
 int st[];
 int tos;
 MyStack()
 {
  st=new int[5];
  tos=-1;
 }
 public void push(int item)
 {
  if(tos==st.length-1)
  {
   System.out.println("Stack Overflow");
  }
  else
  {
   st[++tos]=item; 
   System.out.println("Item Pushed is :- "+item);
  }
 }
 public  void pop()
 {
  if(tos<0)
  {
   System.out.println("Stack Underflow");
  }
  else
  {
   System.out.println("Item popped is :- "+st[tos--]);
  }
 }
}
class InterStDemo
{
 public static void main(String args[])
 {
  int i;
  MyStack ob=new MyStack();
  for(i=1;i<=6;i++)
  ob.push(i);
  for(i=1;i<=6;i++)
  ob.pop();
 }
}