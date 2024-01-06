import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Stack<String> bookStack = new Stack<>();
    System.out.println(bookStack.empty());
    bookStack.push("The Panic of Man ");
    bookStack.push("The level of Man ");
    System.out.println(bookStack.search("The Panic of Man"));
    System.out.println(bookStack.peek());
    System.out.println(bookStack.pop());
    System.out.println(bookStack.size());
    System.out.println(String.valueOf(bookStack));


  }
}