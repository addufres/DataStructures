package queues;

public class QueueTests {

	public static void main(String[] args) {
		Queue<String> names = new Queue<>();
		System.out.println("the queue should be empty " + names.isEmpty());
		names.add("drew");
		names.add("mark");
		names.add("sven");
		names.add("eli");
		System.out.println("the queue should be full " + names.isEmpty());
		while(!names.isEmpty()) {
			names.remove();
		}
		System.out.println("the queue should be empty " + names.isEmpty());
	}

}
