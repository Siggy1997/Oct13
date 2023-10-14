package team;

import java.util.Arrays;
import java.util.HashMap;

public class team01 {
	public static void main(String[] args) {
		
		Solution soll = new Solution();
		
		String[] players = new String[] { "a", "b", "c", "d"};
		String[] callings = new String[] { "b","d","d","c" };
	
		System.out.println(Arrays.toString(soll.solution(players, callings)));
		
	}
}


class Solution {
    public String[] solution(String[] players, String[] callings) {
         
      
 
      HashMap<String, Integer> map = new HashMap<>();

      for (int i = 0; i < players.length; i++) {
         map.put(players[i], i);   // (A,0) (B,1) (C,2)...
      }

      for (int i = 0; i < callings.length; i++) {
          int num = map.get(callings[i]);
          
          if (num > 0) {
              String temp = players[num - 1];
              players[num - 1] = players[num];
              players[num] = temp;

              map.put(players[num - 1], num - 1);
              map.put(players[num], num);
          }
      }
       String[] answer = new String[players.length];
       for (int i = 0; i < answer.length; i++) {
		answer[i] = players[i];
	}

      
       return answer;
   }
}