import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        boolean done = false;
        
        while (!done) {
            System.out.println("Type a word:");
            String word = reader.nextLine();
            if (word.isEmpty()) {
                done = true;
                break;
            } else {
                words.add(word);
            }
        }
        
        for (String w : words) {
            System.out.println(w);
        }
    }
}