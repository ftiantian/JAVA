package holding2;

public class StackTest {
	public static void main(String[] args){
		Stack<String> stack=new Stack<String>();
		for(String s:"My dog has fleas".split(" "))
			stack.push(s);
		while(!stack.empty())
			System.out.print(stack.pop()+" ");
		System.out.println();
		java.util.Stack<String> stack2=new java.util.Stack<String>();
		for(String s:"My dog has fleas".split(" "))
			stack2.push(s);
		while(!stack2.empty())
			System.out.print(stack2.pop()+" ");
	}
}