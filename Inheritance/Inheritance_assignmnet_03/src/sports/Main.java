package sports;

import utility.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] pArr = new Person[3];
		pArr[0] = new Player();
		pArr[1] = new CricketPlayer();
		pArr[2] = new FootballPlayer();
		
		for(Person p : pArr) {
			System.out.println(p);
		}
	}

}
