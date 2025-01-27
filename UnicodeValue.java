import java.util.Scanner;

public class UnicodeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        String input = sc.nextLine();

        if(input.length() == 1) {
            char character = input.charAt(0);

            int unicodeValue = (int) character;
            System.out.println("The unicode value of " + character + " is: " + unicodeValue);

            if (Character.isLetter(character)) {
                System.out.println("Character is a letter.");
            } else if (Character.isDigit(character)) {
                System.out.println("Character is a digit.");
            }
        } else {
                System.out.println("Error: Enter 1 character only!");
        }
    }
}