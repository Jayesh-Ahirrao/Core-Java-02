package mail;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Mail> mails = new ArrayList<>();

		mails.add(new Mail(101, "aa", "aaa", "aaa", LocalDateTime.of(2024, 9, 26, 5, 8)));
		mails.add(new Mail(102, "bb", "bbb", "bbb", LocalDateTime.of(2024, 9, 26, 6, 8)));
		mails.add(new Mail(103, "c", "cc", "acccaa", LocalDateTime.of(2024, 9, 26, 7, 8)));

		Collections.sort(mails, new Comparator<>() {
			@Override
			public int compare(Mail o1, Mail o2) {
				// TODO Auto-generated method stub
				return o2.getRec_time().compareTo(o1.getRec_time());
			}
		});

		for (Mail m : mails) {
			System.out.println(m);
		}
	}

}
