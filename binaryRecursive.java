import java.util.Arrays;
import java.util.Scanner;

public class binaryRecursive {
    /*
    Assumption I made here is I find the maximum/minimum from a sorted array with binary search,
    which is to divide into half, and throw away one half depending on whether you find min or max.
    Repeat it recursively, by reducing the starting/ending index from the array until the index of min and max are equal.
    I made it so that the input user can choose which result they want, either max, min, or range.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of integers?");
        int x = input.nextInt();
        int[] num = new int[x];
        input.nextLine();
        System.out.println("Please enter the " + x + " numbers in order:");
        for (int i = 0; i < num.length; i++ ) {
            num[i] = input.nextInt();
            if(i > 0) {
                while (num[i] < num[i - 1]) {
                    System.out.println("Please enter something greater than the previous one.");
                    num[i] = input.nextInt();
                }
            }
            input.nextLine();
        }
        System.out.println(Arrays.toString(num));
        System.out.println("What do you want to find?\nEnter 1 for maximum.\nEnter 2 for minimum.\nEnter 3 for average.");
        int inpUser = 0; // gets input from user
        while(inpUser != 1 && inpUser != 2 && inpUser != 3){
            System.out.println("Please either 1, 2, or 3");
            inpUser = Integer.parseInt(input.nextLine()); // gets input from user
        }
        if(inpUser ==3) {
            System.out.println(binarySearch(num, 0, num.length - 1, inpUser));
        }
        else{  System.out.println(binarySearch(num, 0, num.length - 1, inpUser)); }

        }
    public static int binarySearch(int[] A, int low, int high, int option){
        int mid = low + (high - low) / 2;
        if(option == 1) {
            if (low == high) {
                return A[high];
            } //if reduced the array until low = high, then that must be the highest
            else if (A[mid] < A[low]) {
                return binarySearch(A, low, mid - 1, option);
            }  //if middle is less than low, then the new array starts from low to middle -1
            else {
                return binarySearch(A, mid + 1, high, option);
            } //else, middle + 1 will be the start of the new array to high
        }
        else if(option ==2){
            if (low == high) {
                return A[high];
            } //if reduced the array until low = high, then that must be the highest
            else if (A[mid] > A[low]) {
                return binarySearch(A, low, mid - 1, option);
            }  //if middle is less than low, then the new array starts from low to middle -1
            else {
                return binarySearch(A, mid + 1, high, option);
            } //else, middle + 1 will be the start of the new array to high
        }
        else{
            int n =0;
            if(low == A.length-1) {return A[low];} //This comes out on top of the stack, so it would be added along with other return statement
            if(low == 0){return (A[low]+binarySearch(A,low+1,high,option))/A.length; } //Once it reaches the bottom, the return will have the total sum
            return A[low] + binarySearch(A, low + 1, high, option);  //Getting the sum
        }
    }
}
