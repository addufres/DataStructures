package queues;

public class Queue<T> {
	private Node<T> head;
	private Node<T> tail;
	public void add(T thing) {
		Node<T> n = new Node<>(thing);
		if(head == null) {
			head = tail = n;
		}
		tail.setNext(n);
		tail = n;
	}
	public T remove() {
		T value = head.getValue();
		head = head.getNext();
		return value;
	}
	public T peek() {
		return head.getValue();
	}
	public boolean isEmpty() {
		return head == null;
	}
	public Queue(Node<T> head, Node<T> tail) {
		super();
		this.head = head;
		this.tail = tail;
	}
	public Queue() {}
	public Node<T> getHead() {
		return head;
	}
	public void setHead(Node<T> head) {
		this.head = head;
	}
	public Node<T> getTail() {
		return tail;
	}
	public void setTail(Node<T> tail) {
		this.tail = tail;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Queue [head=").append(head).append(", tail=").append(tail).append("]");
		return builder.toString();
	}
	
}
