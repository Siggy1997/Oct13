package team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class jong {
	public static void main(String[] args) {
		Solution1 h1 = new Solution1();
		
	}

}

class Solution1 {
	public String[] solution(String[] players, String[] callings) {
		List<String> parr = new ArrayList<String>(Arrays.asList(players));
		for (int i = 0; i < callings.length; i++)
			if (parr.contains(callings[i])) {
				String C = callings[i];
				int num = parr.indexOf(C);
				parr.remove(num);
				parr.add(num - 1, C);
			}
		String[] answer = parr.toArray(new String[parr.size()]);
		System.out.println(answer);
		return answer;
	}
}