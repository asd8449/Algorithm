package VPSTester;

public class CharStack {

	private char[] stack;
	private int top = 0;
	private int capacity;

	public CharStack(int capacity) {
		this.capacity = capacity;
		stack = new char[capacity];
	}

	public boolean push(char par) {
		if (isFull())
			return false;
		stack[top++] = par;
		return true;
	}

	public char pop() {
		if (isEmpty())
			return '0';

		return stack[--top];
	}

	public char getTop() {
		if (isEmpty())
			System.out.println("비어있음");
		return stack[top - 1];
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public boolean isFull() {
		return top == capacity;
	}

}
