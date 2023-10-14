package team;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Race {
   
   
   //map : (key,value)  // put (key,value) // get(key) = value // 동일 key x // 같으면 이전값 덮어씀
   

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String[] playerslist = new String[] { "준식", "상민", "상화", "승현", "종휘", "수진", "화진", "지은", "지윤", "채아" }; // 플레이어 명단 10명

      int a = ((int) (Math.random() * 8) + 3); // 랜덤 몇명뽑을지 3~10

      String[] players = new String[a];

      for (int i = 0; i < a; i++) { // 첫번째 FOR문으로 랜덤 인원 뽑기

         int ran = (int) (Math.random() * 10);

         players[i] = playerslist[ran];

         for (int j = 0; j < i; j++) { //중복값 제거

            if (players[i] == players[j]) {
               i--;
            }
         }
      }
      System.out.println("랜덤으로 뽑힌 플레이어 : " + Arrays.toString(players));
      
      
      
      
      HashMap<String, Integer> map = new HashMap<>();
      
      for (int i = 0; i < players.length; i++) {
         map.put(players[i], i); // ex) (준식,0)(상화,1) (승현,2)... }
      }
      

      int callingran = (int)(Math.random()*6+3); //몇번 부를지 3~8
      
      String[] callings = new String[callingran]; 
      System.out.println(callingran+ "번 불러주세요");
      
      
      for (int i = 0; i < callings.length; i++) {
         System.out.println("이름을 불러주세요 : ");

         callings[i] = sc.nextLine(); //SCANNER로 CALLING에 배열값 넣어주기
         
         int num = map.get(callings[i]); //num 뽑아주기

         if (num > 0) {
            String temp = players[num - 1];
            players[num - 1] = players[num];
            players[num] = temp;
           
            map.put(players[num - 1], num - 1); 
            map.put(players[num], num);
         }
         System.out.println(Arrays.toString(players));
      }

      for (int i = 0; i < players.length; i++) {
         System.out.print((i+1)+"등 : " + players[i]+ " || ");
      }
   }

}