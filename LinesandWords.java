import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
import java.util.StringTokenizer; 
public class TextAnalyzer { 
    public static void main(String[] args) { 
        String fileName = "D:/AAA/sample.txt"; // Replace "input.txt" with the 
path to your input file 
        try (BufferedReader br = new BufferedReader(new 
FileReader(fileName))) { 
            String line; 
            int charCount = 0; 
            int lineCount = 0; 
            int wordCount = 0; 
            while ((line = br.readLine()) != null) { 
                charCount += line.length(); 
                lineCount++; 
                StringTokenizer tokenizer = new StringTokenizer(line); 
                wordCount += tokenizer.countTokens(); 
            } 
            System.out.println("Number of characters: " + charCount); 
            System.out.println("Number of lines: " + lineCount); 
System.out.println("Number of words: " + wordCount); 
        } catch (IOException e) { 
            System.err.println("Error reading the file: " + e.getMessage()); 
        } 
    } 
}
