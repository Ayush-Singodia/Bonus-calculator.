import java.util.Scanner;

public class pc {
    public static void main(String[] args) {

        int salary;


        // Input the integer
        System.out.println("Enter Your Current Salary Here: ");

        try (// Create Scanner object
                Scanner s = new Scanner(System.in)) {
            // Read the next integer from the screen
            salary= s.nextInt();
        }

        if (salary >= 10000) {
            System.out.println("congrays you are at the ace level and you got 5000 bonus!:");
        } else {
            System.out.println("congrays you are at the crown level and you got 2000 bonus!:");
        }

    }
}
