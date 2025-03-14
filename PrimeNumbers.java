import java.util.Scanner; 
public class PrimeNumbersList 
 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter an integer: "); 
        int limit = scanner.nextInt(); 
        System.out.println("Prime numbers up to " + limit + ":"); 
        for (int num = 2; num <= limit; num++) { 
            if (isPrime(num)) { 
                System.out.print(num + " "); 
            } 
        } 
        scanner.close(); 
    }     
    public static boolean isPrime(int num) { 
        if (num <= 1) { 
            return false; 
        } 
        for (int i = 2; i <= Math.sqrt(num); i++) { 
            if (num % i == 0) { 
       return false; 
            } 
        } 
        return true; 
    } 
}
