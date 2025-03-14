import java.util.*; 
class PrintNumbers implements Runnable  
{ 
    private int start; 
    private int end; 
    public PrintNumbers(int start, int end)  
{ 
        this.start = start; 
        this.end = end; 
    } 
    @Override 
    public void run() { 
        for (int i = start; i <= end; i++)  
{ 
            System.out.println(Thread.currentThread().getName() + ": " + i); 
        } 
    } 
} 
public class ThreadingProgram  
{ 
    public static void main(String[] args)  
{ 
        // Create two threads for printing numbers asynchronously 
        Thread thread1 = new Thread(new PrintNumbers(1, 10)); 
        Thread thread2 = new Thread(new PrintNumbers(90, 100)); 
        // Start the threads 
        thread1.setName("Thread1"); 
        thread2.setName("Thread2"); 
        thread1.start(); 
        thread2.start(); 
    } 
} 
