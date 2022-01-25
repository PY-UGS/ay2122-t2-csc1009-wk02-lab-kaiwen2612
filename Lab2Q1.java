import java.util.Scanner;

public class Lab2Q1 {
    static double PI = 3.14159;
    public static void main(String[] args) { 
        System.out.print("Enter a number for radius: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        System.out.println("The area for the circle of radius " + radius + " is " + (radius * radius * PI));
        input.close();
    }
}
