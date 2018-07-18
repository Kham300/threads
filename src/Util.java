import java.util.Stack;

class Util {

    private static Stack<String> stack  = new Stack<>();

    static synchronized int add(String s){
        if (stack.size() > 80){
          return -1;
        }
        stack.push(s);
        return 1;
    }

    static String get(){
        return stack.pop();
    }

    static synchronized void print(String s) {
        System.out.println(s + " runs in receiver thread " + Thread.currentThread().getName());
    }

    static boolean isEmpty(){
       return stack.isEmpty();
    }
}
