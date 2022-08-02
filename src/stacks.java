import java.util.*;

public class stacks {
	public static void main(String[] args) {
		Stack<Integer> myStack;
		myStack = new Stack<Integer>();
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		
		System.out.println(myStack);
		
		Integer removeNumber = myStack.pop();
		
		
		
		System.out.println(myStack);
		System.out.println("You removed " + removeNumber);
		
		System.out.println(myStack.peek());
		System.out.println(myStack.empty());
		
	}
}
