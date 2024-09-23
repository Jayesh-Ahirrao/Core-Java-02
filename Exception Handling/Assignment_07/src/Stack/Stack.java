package Stack;

import Exceptions.StackOverflowException;
import Exceptions.StackUnderflowException;

public class Stack {
	private int top;
	private int[] arr;
	private int size;

	public Stack() {
		top = -1;
		int size = 5;
		arr = new int[size];
	}

	public Stack(int size) {
		top = -1;
		this.size = size;
		arr = new int[size];
	}

	public boolean isFull() {
		return top == (size - 1);
	}

	public boolean isEmpty() {
		return top < 0;
	}

	public void push(int num) throws StackOverflowException {
		if (isFull()) {
			throw new StackOverflowException("Stack is full");
		}
		
		arr[++top] = num;
	}

	public int pop() throws StackUnderflowException {
		if (isEmpty()) {
			throw new StackUnderflowException("Stack is already empty");
		}

		return arr[top--];
	}

	public int peek()  {
		if (isEmpty()) {
			return -1;
		}

		return arr[top];
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int num : arr) {
			sb.append(num + " ");
		}

		return sb.toString();
	}

}
