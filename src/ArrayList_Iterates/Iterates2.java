package ArrayList_Iterates;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterates2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; ++i) {
			list.add(i);
		}
		ListIterator<Integer> iterator = list.listIterator();
		while (iterator.hasNext()) {
			int value = iterator.next();
			System.out.println(value);
			iterator.add(value * 10);
		}
		System.out.println(list);
	}

}
