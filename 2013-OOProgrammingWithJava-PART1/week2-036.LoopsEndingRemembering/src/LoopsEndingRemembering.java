import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type numbers:");
        int input = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        while (input != -1) {
            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            sum += input;
            count++;
            input = Integer.parseInt(reader.nextLine());
        }
        
        double average =  (double)sum / count;
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
