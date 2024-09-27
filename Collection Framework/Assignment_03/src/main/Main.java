package main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import customer.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer[] customers = new Customer[5];
		
		for(int i = 0; i < customers.length; i++) {
			customers[i].accept();
		}
		
		ObjectOutputStream objOutStream= null;
		
		try {
			objOutStream = new ObjectOutputStream(new FileInputStream("employees.ser"));
			
		}

	}

}
