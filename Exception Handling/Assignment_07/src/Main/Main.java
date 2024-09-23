package Main;

import Exceptions.StackOverflowException;
import Exceptions.StackUnderflowException;
import Stack.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 4;
		Stack st = new Stack(size);
		

		try {
			st.push(1);
			st.push(20);
			st.push(3);
			st.push(4);
			st.push(50);
		}catch(StackOverflowException|StackUnderflowException e) { 
			System.err.println(e);
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.err.println("from catch block");
		}
		System.out.println(st);

	}

}
