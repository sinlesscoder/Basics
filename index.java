public class index {
    /*
    I assumed we are looking for only one since the problem mentioned finding only 1 index,
    so the last integer that is equal to its index will be the output. If none, -1 will be returned.
     */
    public static void main(String[] args) {

        int[] s = {-2,0,2,3,6,8,10};
        System.out.println(indexExist(s));
    }
    public static int indexExist(int[] m){
        int found = -1;//initially mark it as -1 incase it doesn't have any corresponding value in the array with its index
        for(int i = 0; i< m.length;i++){
            if(m[i] == i){ found = i; }//if index = the m value at that index, found will have that i value
        }
        return found;
    }
}