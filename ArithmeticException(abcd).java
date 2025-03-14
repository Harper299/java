10(A)
   import java.util.Scanner; 
public class ExceptionDemo 
 { 
    public static void main(String[] args) 
 { 
        Scanner scanner = new Scanner(System.in);                
try  
    {  
            int a = 30, b = 0;  
            int c = a/b;  // cannot divide by zero  
            System.out.println ("Result = " + c);  
        }  
        catch(ArithmeticException e) {  
            System.out.println ("Can't divide a number by 0");  
        }  
} 
} 
   10(B)
      import java.util.Scanner; 
class NullPointer_Demo  
{  
    public static void main(String args[])  
    {  
        try {  
            String a = null;  
            System.out.println(a.charAt(0));  
        }  
catch(NullPointerException e)  
{  
            System.out.println("NullPointerException..");  
        }  
    }  
}
      10(C)
         import java.util.Scanner; 
public class ArrayIndexOutOfBoundException  
{     
    public static void main(String[] args)  
{   
String[] arr = {"One","Two","Three","Four"};                                    
 
        for(int i=0;i<=arr.length;i++)  
{         
             System.out.println(arr[i]);       
 
        }     
    }   
}
         10(D)
            import java.util.Scanner; 
public class NegativeArraySizeExceptionDemo { 
    public static void main(String[] args) { 
        try { 
            // Attempt to create an array with negative size 
            int[] negativeArray = new int[-5]; 
        } catch (NegativeArraySizeException e) { 
            System.out.println("Negative Array Size Exception occurred: " + 
e.getMessage()); 
        } 
    } 
} 
