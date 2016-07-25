class LargestCmdl
{
 public static void main(String a[])
 {
  int n1=0,n2=0,n3=0,e;
  n1=Integer.parseInt(a[0]);
  n2=Integer.parseInt(a[1]);
  n3=Integer.parseInt(a[2]);
  e=n1;
  if(e<n2)
   e=n2;
  if(e<n3)
   e=n3;
  System.out.println("The largest no. is :- "+e);
 }  
}