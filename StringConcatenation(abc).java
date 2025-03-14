6(A)
  import java.util.Scanner; 
class  strcon 
{ 
 public static void main(String arg[])  
 {            
     Scanner sc=new Scanner(System.in);   
     System.out.println("Enter the string1"); 
     String str1= sc.nextLine();    
     System.out.println("Enter the string2"); 
 
     String str2= sc.nextLine();     
        System.out.println(" concatenated String : "+concat(str1,str2)); 
 }             
 static String concat( String s1,String s2) 
 {    
    String s=s1+','+s2; 
     return s; 
 } 
}

6(B)
  import java.util.Scanner; 
public class Substrings 
 { 
    public static void main(String[] args) 
 { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a string: "); 
        String inputString = scanner.nextLine();        
        Substrings(inputString); 
        scanner.close(); 
    } 
    private static void Substrings(String inputString)  
{ 
        int length = inputString.length(); 
        System.out.println("All substrings of the given string:"); 
        for (int i = 0; i < length; i++) 
 { 
            for (int j = i + 1; j <= length; j++)  
{ 
                String substring = inputString.substring(i, j); 
                System.out.println(substring); 
            } 
        } 
    } 
6(C)
  public class Substringc 
 {   
    public static void main(String[] args) 
 {   
        String s1="Java programming";     
        String substr = s1.substring(0);  
        System.out.println(substr);   
        String substr2 = s1.substring(5,10);  
        System.out.println(substr2);     
        String substr3 = s1.substring(5,15);   
    }   
}  
