package lists;

import stacks.Node;

public class LinkedList<T> {
	private Node<T> head;
	private int size = 0;
	
	public void add(T element) {
		Node<T> n = new Node<>(element);
		if(head == null) {head = n;}
		else {
			Node<T> curr = head;
			while(curr.getNext() != null ) {
				curr = curr.getNext();
			}
			curr.setNext(n);
		}
		size++;
	}
	
	public T get(int index) {
		Node<T> curr = head;
		T value = null;
		for (int i = 0; i < index; i++) {
			if(curr.getNext() == null) {
				curr = null;
				break;
			}
			curr = curr.getNext();
		}
		if (curr != null) {
			value = curr.getValue();
		}
		return value;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int size() {
		return size;
	}
	
	public T remove(int index) {
		T value = null;
		if(index < this.size) {
			Node<T> toRemove = head;
			Node<T> prevNode = head;
			int counter = 0;
			while(toRemove.getNext() != null) {
				counter++;
				prevNode = toRemove;
				toRemove = toRemove.getNext();
			}
			value = toRemove.getValue();
			prevNode.setNext(toRemove.getNext());
			size--;
		}
		return value;
	}
	
}
