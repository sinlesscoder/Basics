import java.util.Arrays;
import java.util.Stack;

public class reverseStack {
    /*
    My assumption is to take a stack of characters, which I assumed to be a string of a word,
    then reversed that by converting the string into char[], then flipping the numbers using,
    recursive and for loop.
     */
    public static void main(String[] args) {
        String s = "Welcome";
        System.out.println("Reverse 1: " + String.valueOf(reverseOne(s,0,s.length()-1)));
        System.out.println("Reverse 2: " + String.valueOf(reverseTwo(s,s.length()-1)));
    }

    public static char[] reverseOne(String x, int low, int high) {
        char[] temp1 = x.toCharArray(); //convert string into char array
        char hold = temp1[low]; //swap first and last character in the array
        temp1[low] = temp1[high];
        temp1[high] = hold;
        String str = String.valueOf(temp1); //convert back to string so we can use it to input into the recursion
        if(high > low) {
            return reverseOne(str, low + 1, high - 1);
        }
        else{ return temp1; }//once the recursion went through all the characters, return the flipped char array
    }
    public static char[] reverseTwo(String x, int n){
        char[] temp1 = x.toCharArray();
        for(int i = 0; i < n-1; ++i){
            char hold = temp1[i];//swap
            temp1[i] = temp1[n];
            temp1[n] = hold;
            --n;
        }
        return temp1;
    }
}
