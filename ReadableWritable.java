import java.util.*; 
import java.io.File; 
public class FileInformation 
 { 
    public static void main(String[] args) 
 { 
        // Read file name from the user 
        String fileName = "D:/demo/sample.txt"; // Provide a default file path if 
needed 
        // You can use Scanner to read input from the user if you're running this 
program in a console environment 
        // Create a File object with the provided file name 
        File file = new File(fileName); 
        // Check if the file exists 
        boolean exists = file.exists(); 
        System.out.println("File exists: " + exists); 
        // Check if the file is readable 
        boolean readable = file.canRead(); 
        System.out.println("File is readable: " + readable); 
        // Check if the file is writable 
        boolean writable = file.canWrite(); 
        System.out.println("File is writable: " + writable); 
        // Get the type of file (directory or regular file) 
        String fileType = "Unknown"; 
        if (file.isDirectory()) { 
            fileType = "Directory"; 
        } else if (file.isFile()) { 
            fileType = "Regular file"; 
        } 
        System.out.println("File type: " + fileType); 
        // Get the length of the file in bytes 
        long length = file.length(); 
        System.out.println("File length (bytes): " + length); 
    } 
}
