package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
			
		list.add("one");
		list.add("one");
		list.add("two");
		list.add("two");
		list.add("two");
		list.add("two");
		list.add("three");
		list.add("one");
		
		Collections.sort(list);
		
		for(int i = 1 ; i < list.size(); ) {
			if(list.get(i-1) == list.get(i)) {
				list.remove(i);
				continue;
			}
			
			i++;
		}
		
		System.out.println(list);
	}

}
