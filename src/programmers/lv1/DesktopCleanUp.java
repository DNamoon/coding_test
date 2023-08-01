package programmers.lv1;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/161990
 * 바탕화면 정리
 */
public class DesktopCleanUp {
    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int ldx = wallpaper.length - 1;
        int ldy = wallpaper[0].length() - 1;
        int rdx = 0;
        int rdy = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            if (!wallpaper[i].contains("#")) {
                continue;
            }
            String[] findX = wallpaper[i].split("");
            for (int j = 0; j < findX.length ; j++) {
                if ("#".equals(findX[j])) {
                    if (ldx > i) { //ldx 최솟값
                        ldx = i;
                    }
                    if (ldy > j) { //ldy 최솟값
                        ldy = j;
                    }
                    if (rdx < i) { //rdx 최댓값
                        rdx = i;
                    }
                    if (rdy < j) { //rdy 최댓값
                        rdy = j;
                    }
                }
            }
        }

        answer[0] = ldx;
        answer[1] = ldy;
        answer[2] = rdx + 1;
        answer[3] = rdy + 1;

        return answer;
    }

    public static void main(String[] args) {
        String[] wallpaper = {".#...", "..#..", "...#."};
        System.out.println(Arrays.toString(solution(wallpaper)));
    }
}
