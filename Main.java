import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>(); 
        
        int sum = 0;
        
        while(true) {
            System.out.println("Please type numbers to find the average. Type STOP when finished");
            String userAns = input.nextLine();

            if(userAns.equalsIgnoreCase("STOP")) {
                break;
            }

            try {
                int num = Integer.parseInt(userAns); // fix: parse the string, not Scanner
                nums.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or STOP to finish.");
            }
        }

        System.out.println("Numbers entered: " + nums);

        // calculate sum
        for(int i = 0; i < nums.size(); i++) {  // fix: ArrayList uses size() not length()
            sum += nums.get(i);                  // fix: use get(i) to access elements
        }

        if(nums.size() > 0) {
            double average = (double) sum / nums.size(); // cast to double for decimals
            System.out.println("The average is: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        input.close();
    }
}

