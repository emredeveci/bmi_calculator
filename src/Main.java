import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable definitions
        double weight, height;

        //scanner initialization
        Scanner input = new Scanner(System.in);

        //ask for user inputs
        System.out.print("Please enter your height in meters: ");
        height = input.nextDouble();

        System.out.print("Please enter your weight in kilograms: ");
        weight = input.nextDouble();

        //print the end result
        System.out.println("Your Body Mass Index is: " + weight / (height * height));

        input.close();
    }
}