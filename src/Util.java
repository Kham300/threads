import java.util.Stack;

public class Util {

    private static Stack<String> stack  = new Stack<>();

    public static synchronized int add(String s){
        if (stack.size() > 80){
          return -1;
        }
        stack.push(s);
        return 1;
    }

    public static synchronized String get(){
        return stack.pop();
    }

    static synchronized void print(String s) {
        System.out.println(s + " name thread " + Thread.currentThread().getName());
    }

    public synchronized void getSize(){
        stack.size();
    }

    public static synchronized boolean isEmpty(){
       return stack.isEmpty();
    }
}
