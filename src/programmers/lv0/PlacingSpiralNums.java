package programmers.lv0;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181832
 * 정수를 나선형으로 배치하기
 *
 * 양의 정수 n이 매개변수로 주어집니다. n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터
 * 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
 */

public class PlacingSpiralNums {

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int startRow = 0;
        int endRow = n - 1;
        int startColumn = 0;
        int endColumn = n - 1;

        int k = 1;
        int row = startRow;
        int column = startColumn;
        while (startRow <= endRow && startColumn <= endColumn) {
            while (column <= endColumn) {
                answer[row][column++] = k++;
            }
            column = endColumn;
            row++;
            startRow++;

            while (row <= endRow) {
                answer[row++][column] = k++;
            }
            row = endRow;
            column--;
            endColumn--;

            while (column >= startColumn) {
                answer[row][column--] = k++;
            }
            column = startColumn;
            row--;
            endRow--;

            while (row >= startRow) {
                answer[row--][column] = k++;
            }
            row = startRow;
            column++;
            startColumn++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(4)));

    }

}
