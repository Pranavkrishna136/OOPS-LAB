import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("The indices are " + i + ", " + j);
                    System.out.println("Because nums[" + i + "] + nums[" + j + "] = " 
                                        + nums[i] + " + " + nums[j] + " = " + target);
                    return; 
                }
            }
        }

        System.out.println("No pair found!");
    }
}
