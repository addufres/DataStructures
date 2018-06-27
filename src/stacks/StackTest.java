package stacks;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> names = new Stack<> ();
		System.out.println("Empty? " + names.isEmpty());
		names.push("julian");
		names.push("mark");
		names.push("xian");
		names.push("meghan");
		names.push("drew");
		System.out.println("Empty? " + names.isEmpty());
		while(!names.isEmpty() ) {
			System.out.println(names.pop());
		}
	}

}
