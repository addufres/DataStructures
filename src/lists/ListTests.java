package lists;

public class ListTests {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		System.out.println(ll.isEmpty());
		System.out.println(ll.size());
		ll.add("Drew");
		System.out.println(ll.size());
		ll.add("Mark");
		System.out.println(ll.size());
		ll.add("Sven");
		System.out.println(ll.size());
		ll.add("Eli");
		System.out.println(ll.size());
		ll.add("Nate");
		System.out.println(ll.size());
		ll.remove(2);
		System.out.println(ll.size());
		
	}

}
