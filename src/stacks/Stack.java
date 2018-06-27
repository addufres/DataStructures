package stacks;

public class Stack<T> {
	private Node<T> top = null;
	public void push(T thing) {
		Node<T> newNode = new Node<>(thing, top);
		top = newNode;
	}
	public T pop() {
		T value = top.getValue();
		top = top.getNext();
		return value;
	}
	public T peek() {
		return top.getValue();
	}
	public boolean isEmpty() {
		return top == null;
	}
}
