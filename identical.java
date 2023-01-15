public class identical {
    public static void main(String[] args) {
        /*
         I assumed we are not supposed to convert the int into other type,
         so I decided to use the math term of remainder and dividing,
         and adding them through a recursion, as we reduced the original int by dividing with 10.
         */
        int s = 11011;
        System.out.println(palindromeNum(s,0));
        if(palindromeNum(s,0) ==s){ System.out.println("True");}
        else{ System.out.println("False"); }
    }
    public static int palindromeNum(int m, int temp){
        if(m == 0){ return temp; }
        temp = temp*10 + m%10; //reversing, by adding the remainder of m/10 and adding into the temp, initially being 0
        return palindromeNum(m/10,temp); //shrinking every loop
    }
}