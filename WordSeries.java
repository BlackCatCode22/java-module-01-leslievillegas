import java.util.Scanner;

public class WordSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a noun: ");
        String noun = sc.nextLine();

        System.out.println("Enter a verb: ");
        String verb = sc.nextLine();

        System.out.println("Enter a adj: ");
        String adj = sc.nextLine();

        System.out.println("Enter a adv: ");
        String adv = sc.nextLine();

        System.out.println("Your story:");
        String story = "There once was a " + adj + " " + noun + " who liked to " + verb + ". This activity was very " + adv + " for them.";

        System.out.println(story);
    }
}