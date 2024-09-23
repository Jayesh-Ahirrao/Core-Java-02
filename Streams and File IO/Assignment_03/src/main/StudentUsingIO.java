package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utils.Student;

public class StudentUsingIO {
	public static void main(String[] args) {
		System.out.println("Enter the details of student");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Student stud = new Student();
		try {
			System.out.print("Enter roll Num:\t");
			stud.setRollNum(Integer.parseInt(br.readLine()));

			System.out.print("Enter name:\t");
			stud.setName(br.readLine());

			System.out.print("Enter marks: \t");
			stud.setMarks(Integer.parseInt(br.readLine()));

			System.out.println(stud);
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
