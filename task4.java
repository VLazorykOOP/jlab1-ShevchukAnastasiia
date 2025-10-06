
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = in.nextLine();
        in.close();
        String[] words = text.split("[^\\p{L}]+"); 
        System.out.println("Words without repeated letters:");

        for(String word : words) {
            if (!word.isEmpty() && hasUniqueLetters(word.toLowerCase())) {
                System.out.println(word);
            }
        }
    }

    private static boolean hasUniqueLetters(String word) {
        for(int i = 0; i < word.length(); ++i) {
            for(int j = i + 1; j < word.length(); ++j) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
