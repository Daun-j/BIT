

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
		
		//데이터를 정렬하기 위해 Set-> List
		List<Integer> list = new LinkedList<>(set);
		
		//데이터 정렬
		Collections.sort(list);
		
		System.out.println(list);

	}

}
