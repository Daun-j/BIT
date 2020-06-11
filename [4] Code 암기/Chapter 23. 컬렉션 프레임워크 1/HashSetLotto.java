

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		while(set.size()<6) {
			int num= (int)(Math.random()*45)+1;
			System.out.println(num);
			set.add(new Integer(num));
		}
		
		//�����͸� �����ϱ� ���� Set-> List
		List<Integer> list = new LinkedList<>(set);
		
		//������ ����
		Collections.sort(list);
		
		System.out.println(list);

	}

}
