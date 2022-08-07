import java.util.Scanner;
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int length = nums.length-1;
        for (int index = 0; index <= length; index++) {
            if (nums[index] == val) { 
                int temp = nums[index];
                nums[index] = nums[length];
                nums[length] = temp;
                length--;
                index = -1;
            }
        }
    return ++length;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int SIZE = input.nextInt();
        int[] nums = new int[SIZE];
        System.out.println("Enter the Array elements: ");
        for(int index = 0; index < nums.length; index++) {
            nums[index] = input.nextInt();
        }
        System.out.println("Which element to be removed? ");
        int val = input.nextInt();
        int counter = removeElement(nums, val);
        for (int index = 0; index < counter; index++) {
            System.out.println(nums[index]);
        }
    }
}