package queues;

public class Node<T> {
	private T value;
	private Node<T> next;
	public Node(T value) {
		super();
		this.value = value;
	}
	public Node() {}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Node [value=").append(value).append(", next=").append(next).append("]");
		return builder.toString();
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
}
