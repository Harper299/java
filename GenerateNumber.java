import java.util.Random; 
public class RandomNumberGenerator  
{ 
    public static void main(String[] args) 
 {         
        int lowerLimit = 10; 
        int upperLimit = 50;      
        Random random = new Random();     
        int randomNumber = random.nextInt(upperLimit - lowerLimit + 1) + 
lowerLimit;         
        System.out.println("Generated Random Number: " + randomNumber);         
               if (randomNumber < 20)  
 { 
  System.out.println("The number is less than 20."); 
  } 
             else if (randomNumber >= 20 && randomNumber < 40)  
 { 
 System.out.println("The number is between 20 and 40 (inclusive)."); 
   }  
              else  
 { 
 System.out.println("The number is greater than or equal to 40."); 
 } 
   } 
}
