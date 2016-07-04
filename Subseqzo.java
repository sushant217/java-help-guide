/*
 *Write a program to get the subsequence of a bit 1 and 0 given in a array of bits.(Equal No. of 1's and 0's)
  For example :  array={1,0,1,1,0,1,1}   Output={1,0,1,0}
                array={1,1,0,1,0,0,1,1} Output={1,1,0,1,0,0}
 */
package assignment1;
import java.util.ArrayList;
/**
 * @author snlkjha
 */
public class SubSequences {
   
     public static ArrayList<Integer> subsequence(int a[]){    // Array a contains values in the form of 1's and 0's
       
        ArrayList<Integer> sub=new ArrayList<>();
        int count1=0,count0=0,min;
        for(int i=0;i<a.length;i++){
            if(a[i]==1) count1++;   // counting No of 1's
            else count0++;          // counting No of 0's
        }
        min=count0<=count1?count0:count1;                                   //Minimum of counts of 1 and 0
        count0=0;count1=0;
        if(min==0) System.out.println("No subsequence possible. thank u");  // if the no of 1's or 0's is zero.
        else for(int i=0;i<a.length ;i++){                                 
            if(a[i]==1 && count1++<min) sub.add(a[i]);                      // Storing values in ArrayList
            else if(a[i]==0 && count0++<min)   sub.add(a[i]);  
        }
        return sub;                                                        
    }
    
    public static void display(int a[]){
        for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
        System.out.println();
    }
   
     public static void main(String[] args){
       
        int b[]={1,1,1,1,0,0,0,0,0,0,1,1,1,1} ;
        System.out.print("Array=");display(b);
        ArrayList<Integer> sub=subsequence(b);
        System.out.println("Subsequence="+sub);  
    }  
}

/*OUTPUT :
 * Array=1 1 1 1 0 0 0 0 0 0 1 1 1 1
 * Subsequence=[1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1]
 */