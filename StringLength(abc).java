5(A)
import java.util.Scanner; 
public class StringLengthManipulation  
{ 
    public static void main(String[] args) 
 { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a string: "); 
        String inputString = scanner.nextLine();         
        char[] charArray = inputString.toCharArray(); 
        int length = charArray.length;         
        System.out.println("Length of the string: " + length);         
        scanner.close(); 
    } 
}

5(B)
  import java.util.Scanner; 
public class StringPositionManipulation  
{ 
    public static void main(String[] args)  
{ 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a string: "); 
        String inputString = scanner.nextLine();         
        System.out.print("Enter the position (0-indexed): "); 
        int position = scanner.nextInt();         
        if (position >= 0 && position < inputString.length())   
{ 
            char[] charArray = inputString.toCharArray(); 
            char character = charArray[position]; 
            System.out.println("Character at position " + position + ": " + 
character); 
        } else  
 { 
            System.out.println("Invalid position."); 
        }    
        scanner.close(); 
    } 
} 

5(C)
  import java.util.Scanner; 
public class StringConcatenating { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the first string: "); 
        String firstString = scanner.nextLine();         
        System.out.print("Enter the second string: "); 
        String secondString = scanner.nextLine();         
        char[] firstCharArray = firstString.toCharArray(); 
        char[] secondCharArray = secondString.toCharArray();         
        int totalLength = firstCharArray.length + secondCharArray.length; 
        char[] concatenatedCharArray = new char[totalLength];         
        int index = 0; 
        for (char c : firstCharArray) { 
            concatenatedCharArray[index++] = c; 
        } 
        for (char c : secondCharArray) { 
            concatenatedCharArray[index++] = c; 
        }         
        String concatenatedString = new String(concatenatedCharArray); 
        System.out.println("Concatenated string: " + concatenatedString);         
        scanner.close(); 
    } 
}
