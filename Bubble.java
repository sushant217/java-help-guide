public class Bubble{
static void bubblesort(int[] arr)
{
int temp,n;
n=arr.length;
for(int j=0;j<n-1;j++)
{
for(int i=0;i<n-1;i++)
{
if(arr[i]> arr[i+1])
{
temp=arr[i];
arr[i]=arr[i+1];
arr[i+1]=temp;
}
}
}}
public static void main(String args[])
{
int arr[]={2,5,3,8,6,1};
System.out.println("Before sorting");
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]+" ");
}
System.out.println();
bubblesort(arr);
System.out.println("Array After Bubble Sort");  
   for(int i=0; i < arr.length; i++){  
   System.out.print(arr[i] + " ");  
                }  
}
}