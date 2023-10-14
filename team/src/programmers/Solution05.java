package programmers;

import java.util.Scanner;
import java.lang.Math;

public class Solution05 {
	
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] wallpaper = new String[n];
        scanner.nextLine(); // 

        for (int i = 0; i < n; i++) {
            wallpaper[i] = scanner.nextLine();
        }

        int[] result = solution(wallpaper);

        System.out.println("Output:");
        for (int i = 0; i < 4; i++) {
            System.out.print(result[i] + " ");
        }
        
        scanner.close();
    }

    public static int[] solution(String[] wallpaper) {
    	
        int[] answer = new int[4];

        int left, right, up, down;
        
        //드래그는 왼쪽 위에서 오른쪽 아래까지. 따라서 왼쪽, 오른쪽, 위쪽,아래쪽 좌표를 
        //int 변수로 선언함
        // left : 드래그 왼쪽 끝 좌표 / right : 드래그 오른쪽  끝 좌표
        // up : 드래그 위쪽 끝 자표 / down: 드래그 아래 끝 좌표
        // wallpaper(격자판)이랑 동일시 시켜주는 작업
        left = up = 49; //wallpaper의 최대길이에서 -1
        right = down = 0; //wallpaper의 최소길이에서 -1

        // 중첩 for문
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {// 파일이 존재하면 #
                    left = Math.min(left, j);
                    up = Math.min(up, i);
                    right = Math.max(right, j);
                    down = Math.max(down, i);
                }
            }
        }
       
        
        answer[0] = up;
        answer[1] = left;
        answer[2] = down + 1; // 아래쪽 좌표 +1
        answer[3] = right + 1; //오른쪽 좌표 +1
        return answer;
    }
}