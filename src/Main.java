import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weight, height;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height in meters: ");
        height = input.nextDouble();

        System.out.print("Please enter your weight in kilograms: ");
        weight = input.nextDouble();

        System.out.println("Your Body Mass Index is: " + weight / (height * height));

        input.close();
    }
}