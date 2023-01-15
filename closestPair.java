import java.util.Arrays;

public class closestPair {
    /*
    From my assumption, I need to find the two closest integers and output them,
    so I will output the first two integers closest to each other after sorting
    them with one of the sorting algorithms we learned.
     */
    public static void main(String[] args) {
        int [] arr = {3,-2,6,-1,10,5, 100};
        pairOne(arr,arr.length);
        pairTwo(arr);
        pairThree(arr);
    }
    public static void pairOne(int [] A, int n){ //Big-O notation = n^2 times
        int low;
        for (int i = 0; i < n-1; i++) {
            low = i;
            for (int j = i + 1; j < n; j++) { //comparing index x and index x+1
                if (A[j] < A[low]) {
                    low = j;
                }
            }
            int hold = A[i]; //swap
            A[i] = A[low];
            A[low] = hold;
        }
        System.out.println(Arrays.toString(A));
        int k = A[1]-A[0]; //marking initial value of k
        int start = A[0];
        int end = A[1];
        for(int j = 0; j < A.length-1; j++) { //using k, we compare each pair of integer
            int x = A[j+1]-A[j];
            if(x < k){ //if k is greater, then swap
                k = x;
                start = A[j];
                end = A[j+1];
            }
        }
        System.out.println("Two integers are: " + start + " and " + end);
    }
    public static void pairTwo(int [] A){ //Big-O notation = n log n times
        Arrays.sort(A);
        int m = A[1]-A[0]; //marking initial value of m
        int start = A[0];
        int end = A[1];
        for(int j = 0; j < A.length-1; j++) { //using k, we compare each pair of integer
            int x = A[j+1]-A[j];
            if(x < m){ //if k is greater, then swap
                m = x;
                start = A[j];
                end = A[j+1];
            }
        }
        System.out.println("Two integers are: " + start + " and " + end);
    }
    public static void pairThree(int[] A){ //Big-O notation n factorial
        int y = 1;
        while(y == 0){ //shuffling the array until it is sorted
            for(int k = 1; k <A.length; k++){
                if(A[k] < A[k-1]){ y =0; }
                y = 1;
            }
            for(int i=1; i < A.length; i++){ //swapping the random index and i
                int j = (int)(Math.random()*i);
                int m = A[i];
                A[i] = A[j];
                A[j] = m;
            }
        }
        System.out.println(Arrays.toString(A));
        int m = A[1]-A[0]; //marking initial value of m
        int start = A[0];
        int end = A[1];
        for(int j = 0; j < A.length-1; j++) { //using k, we compare each pair of integer
            int x = A[j+1]-A[j];
            if(x < m){ //if k is greater, then swap
                m = x;
                start = A[j];
                end = A[j+1];
            }
        }
        System.out.println("Two integers are: " + start + " and " + end);
    }
}