import java.util.Scanner;

public class FaveNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Favorite Number: ");
        int favoriteNum = sc.nextInt();

        System.out.println("Your favorite number is " + favoriteNum + ". Nice choice!");
    }
}