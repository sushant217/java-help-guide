public class SecMin
{
public static void main (String args[])
{
int[]arr={2,5,3,8,6,1};
for(int j:arr)
System.out.print(j+" ");
System.out.println();
int temp,n=arr.length;
for(int j=0;j<n-1;j++)
{
for(int i=0;i<n-1;i++)
{
if(arr[i]>arr[i+1])
{
temp=arr[i];
arr[i]=arr[i+1];
arr[i+1]=temp;
}
}}
for(int j:arr)
System.out.print(j+" ");
System.out.println("secondmix is"+arr[1]);
System.out.println("secondmax is"+arr[n-2]);
}}