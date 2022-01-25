import java.util.Scanner;

public class Lab2Q2 {
    public static void main(String[] args) { 
        System.out.print("Enter three numbers: ");
        double[] nums;
        nums = new double[3];
        Scanner input = new Scanner(System.in);
        for (int x = 0; x < 3; x = x + 1){
            //Scanner input = new Scanner(System.in);
            nums[x] = input.nextDouble();
        }

        double average = (nums[0] + nums[1] + nums[2]) / 3;

        System.out.print("The average of " + nums[0] + " " + nums[1] + " " + nums[2] + " is " + average);
        input.close();
    }
}
