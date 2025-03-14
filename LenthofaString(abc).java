7(A)
  import java.util.Scanner; 
public class LengthofString { 
    public static void main(String[] args)  
{ 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a string: "); 
        String inputString = scanner.nextLine();         
        StringBuffer stringBuffer = new StringBuffer(inputString); 
        int length = stringBuffer.length();         
        System.out.println("Length of the string: " + length);         
        scanner.close(); 
    } 
} 
7(B)
  import java.util.Scanner; 
public class ReverseString  
{ 
    public static void main(String[] args)  
{ 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a string: "); 
        String inputString = scanner.nextLine();         
        StringBuffer stringBuffer = new StringBuffer(inputString); 
        stringBuffer.reverse();         
        String reversedString = stringBuffer.toString(); 
        System.out.println("Reversed string: " + reversedString);         
        scanner.close(); 
    } 
} 
7(C)
  import java.util.Scanner; 
public class DeleteString 
 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a string: "); 
        String inputString = scanner.nextLine();         
        System.out.print("Enter the substring to delete: "); 
        String substringToDelete = scanner.nextLine();         
        StringBuffer stringBuffer = new StringBuffer(inputString); 
        int index = stringBuffer.indexOf(substringToDelete);         
        if (index != -1) { 
            stringBuffer.delete(index, index + substringToDelete.length()); 
            String modifiedString = stringBuffer.toString(); 
            System.out.println("Modified string: " + modifiedString); 
        } 
else  
{ 
            System.out.println("Substring not found in the given string."); 
        }         
        scanner.close(); 
    } 
} 
