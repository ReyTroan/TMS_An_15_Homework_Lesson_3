
import java.util.Scanner;

public class InputAndOutput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scan.nextLine();
        System.out.println("Your word: " + word);
    }

}

