import java.util.Arrays;

public class Quicksort {
    public static void main(String args[]) {
        int[] x = {1,2,3,4,5};
        Sort(x);
        System.out.println("Quick sort : " + Arrays.toString(x));
    }

    public static void Sort(int x[]) {
        quickSort(x,0,x.length-1);
    }

    public static void quickSort(int x[], int x1, int x2) { //the runtime for worst case scenario is n^2
        if (x1 < x2) {
            int pivotLocation = partition(x, x1, x2);
            quickSort(x, x1, pivotLocation - 1);
            quickSort(x, pivotLocation, x2-1);
        }
    }

    public static int partition(int x[], int x1, int x2) { //quicksort, comparing pivot value with starting value and ending value until they cross
        int pivot = x[(x1+x2)/2]; //making the middle value as pivot
        while(x2 > x1) {
            while (x[x1] < pivot) {//continue until pivot is less
                ++x1;
            }
            while (x[x2] > pivot) {//continue until pivot is greater
                --x2;
            }
            if (x1 < x2) {
                int hold = x[x1];//swap
                x[x1] = x[x2];
                x[x2] = hold;
                ++x1;
                --x2;
            }
        }
        return x1;
    }
}



