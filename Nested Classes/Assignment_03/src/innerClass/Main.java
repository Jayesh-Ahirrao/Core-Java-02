package innerClass;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date d1 = new Date(2024, 9, 26) {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public String toString() {
				return this.getYear() + "*" + this.getMonth() + "*" + this.getDay();
			}

		};

		System.out.println(d1);
	}
}
