package placement;


import java.util.Arrays;
//Question4

public class AnagramProgram
{
    
static void isAnagram(String s1, String s2)
{
  
//Removing all white spaces from s1 and s2
 
        
String string1 = s1.replaceAll("\\s", "");
 
        
String string2 = s2.replaceAll("\\s", "");
 
   
//Initially setting status as true
 
        
boolean status = true;
 
        
if(string1.length() != string2.length())
{
     //Setting status as false if both Strings do not have the same length
 
            status = false;
        
}
        
else
        
{
            //Changing the case of characters of both Strings and Converting them to char array
 
            
char[] s1Array = string1.toLowerCase().toCharArray();
 
            
char[] s2Array = string2.toLowerCase().toCharArray();
 
            //Sorting both s1Array and s2Array
 
            
Arrays.sort(s1Array);
 
            
Arrays.sort(s2Array);
 
            //Checking whether s1Array and s2Array are equal
 
            
status = Arrays.equals(s1Array, s2Array);
        }
 
        //Output
 
        
if(status)
        
{
            
System.out.println(s1+" and "+s2+" are anagrams");
        
}
        
else
        
{
            
System.out.println(s1+" and "+s2+" are not anagrams");
        
}
}
 
    
public static void main(String[] args)
    
{
        
isAnagram("Mother In Law", "Hitler Woman");
 
        
isAnagram("keEp", "peeK");
 
        
isAnagram("SiLeNt CAT", "LisTen AcT");
 
        
isAnagram("Debit Card", "Bad Credit");
 
        
isAnagram("School MASTER", "The ClassROOM");
 
        
isAnagram("DORMITORY", "Dirty Room");
 
        
isAnagram("ASTRONOMERS", "NO MORE STARS");
 
        
isAnagram("Toss", "Shot");
 
        
isAnagram("joy", "enjoy");
    
}
}
