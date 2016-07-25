class StringFunc
{
 public static void main(String a[])
 {            
            String s1 = new String("My name is mohit") ; 
            String s2 = new String("My name is sushant");
            char[] ch = new char[] { 'g', 'G' };
            char[] copy;
            int i;
            System.out.println("The string is :- " + s1);
            System.out.println("The second string is :- " + s2);
            System.out.println("The existence of sushant in string1 is :- " + s1.contains("mohit"));
            System.out.println("The letter a from starting is at index in string 1 :- " +s1.indexOf("a"));
            System.out.println("The letter a fron ending is at index in string 1 :- " +s1.lastIndexOf("a"));
            System.out.println("The substring from index 11 in string 1 :- " + s1.substring(11));
            System.out.println("The length of string1 is :- " + s1.length());
            if (s1.compareTo(s2) == 0)
            {
                System.out.println("First and second string are equal");
            }
            else
            {
                System.out.println("First and second string are not equal");
            }
            System.out.println("The concatenation of strings is :- ");
            System.out.println(s1.concat(s2));
            System.out.println("The existence of arg in end in string1 is :- "+s1.endsWith("hit"));
            System.out.println("The existence of My in starting in string1 is :- " + s1.startsWith("My"));
            copy=s1.toCharArray();
            for(i=0;i<copy.length;i++)
            {            
               System.out.println(copy[i]);
            }
  }
}