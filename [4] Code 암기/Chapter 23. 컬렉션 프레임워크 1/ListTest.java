

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();

		// �÷��� �ν��Ͻ��� ���ڿ� �ν��Ͻ� ����
		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		// 1. list - get
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + '\t');
		}
		System.out.println();

		// 2. enhenced for
		for (String l : list) {
			System.out.print(l + '\t');
		}
		System.out.println();

		// 3. iterator
		for (Iterator<String> itr = list.iterator(); itr.hasNext();) {
			System.out.print(itr.next().toString() + '\t');
		}
	}

}
