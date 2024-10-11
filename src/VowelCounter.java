import java.util.Scanner;

public class VowelCounter {
    
    public static int countVowels(String sentence) {
        int vowelCount = 0;
        sentence = sentence.toLowerCase(); // Convert to lower case for easier comparison
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if ("aeiou".indexOf(ch) != -1) { // Check if the character is a vowel
                vowelCount++;
            }
        }
        
        return vowelCount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String input = scanner.nextLine();
            int result = countVowels(input);
            System.out.println("Number of vowels: " + result);
        }
    }
}
