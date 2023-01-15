import java.util.Stack;

public class stackRecursive {
    /*
    My assumption is to take a stack of characters, which I assumed to be a string of a word,
    then reversed that by converting the string into char[], then flipping the numbers using,
    recursive and for a loop.
     */
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        Stack<Character> m = new Stack<>();
        s.push('g');
        s.push('o');
        s.push('o');
        s.push('g');
        s.push('l');
        s.push('e');
        System.out.println(stack(s, m));
    }
    public static Stack stack(Stack A, Stack B) {
      if(A.empty()){ return B; }
      B.push(A.pop());
      return stack(A, B);
    }
}
