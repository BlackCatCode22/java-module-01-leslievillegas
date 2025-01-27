import java.util.Scanner;

public class TemperatureCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temp in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("The temp " + fahrenheit + " converts to " + celsius + " in celsius.");
    }
}