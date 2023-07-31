package programmers.lv0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120866
 * 안전지대
 *
 * 다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
 * image.png
 * 지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
 * 지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
 *
 */

//실패!!!! -> 다시 성공
public class SafetyZone {
    public static int solution(int[][] boards) {
        int answer = 0;

        for (int i = 0; i < boards.length; i++) {

            for (int j = 0; j < boards[i].length; j++) {
                int isBomb = boards[i][j];

                if (isBomb == 1) {
                    //i(행)이 처음이고, 열의 처음일때
                    if (i == 0) {
                        if (j == 0) {
                            boards[i][j+1] = -1;
                            boards[i+1][j] = -1;
                            boards[i+1][j+1] = -1;
                        } else if (j < boards.length - 1) {
                            boards[i][j-1] = -1;
                            boards[i][j+1] = -1;
                            boards[i+1][j-1] = -1;
                            boards[i+1][j] = -1;
                            boards[i+1][j+1] = -1;
                        } else if (j == boards.length - 1) {
                            boards[i][j-1] = -1;
                            boards[i+1][j-1] = -1;
                            boards[i+1][j] = -1;
                        }
                    } else if (i<boards.length -1) {
                        if (j == 0) {
                            //(행)이 처음이고, 열의 중간일때
                            boards[i - 1][j] = -1;
                            boards[i - 1][j + 1] = -1;
                            boards[i][j + 1] = -1;
                            boards[i + 1][j] = -1;
                            boards[i + 1][j + 1] = -1;
                        } else if (j == boards.length - 1) {
                            boards[i-1][j-1] = -1;
                            boards[i-1][j] = -1;
                            boards[i][j-1] = -1;
                            boards[i+1][j-1] = -1;
                            boards[i+1][j] = -1;
                        } else {
                            boards[i-1][j-1] = -1;
                            boards[i-1][j] = -1;
                            boards[i-1][j+1] = -1;
                            boards[i][j-1] = -1;
                            boards[i][j+1] = -1;
                            boards[i+1][j-1] = -1;
                            boards[i+1][j] = -1;
                            boards[i+1][j+1] = -1;
                        }
                    } else if (i == boards.length - 1) {
                        if (j == 0) {
                            boards[i-1][j] = -1;
                            boards[i-1][j+1] = -1;
                            boards[i][j+1] = -1;
                        } else if (j < boards.length - 1) {
                            boards[i-1][j-1] = -1;
                            boards[i-1][j] = -1;
                            boards[i-1][j+1] = -1;
                            boards[i][j-1] = -1;
                            boards[i][j+1] = -1;
                        } else if (j == boards.length - 1) {
                            //(행)이 처음이고, 열의 마지막일 때
                            boards[i-1][j - 1] = -1;
                            boards[i-1][j] = -1;
                            boards[i][j-1] = -1;
                        }
                    }
                }
            }
        }

        for (int[] board : boards) {
            for (int i : board) {
                if (i == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static int solution2(int[][] boards) {
//        int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
//        int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[][] directions = {{-1, -1}, {0, -1}, {1, -1}, {-1, 0}, {1, 0}, {-1, 1}, {0, 1}, {1, 1}};
        int answer = 0;

        for (int i = 0; i < boards.length; i++) {
            for (int j = 0; j < boards[i].length; j++) {

                if (boards[i][j] == 1) {
                    for (int[] direction : directions) {
                        int nx = i + direction[0];
                        int ny = j + direction[1];

                        if (nx >= 0 && nx < boards.length && ny >= 0 && ny < boards[i].length) {
//                            findBomb(boards, nx, ny);
                            if (boards[nx][ny] != 1) {
                                boards[nx][ny] = -1;
                            }
                        }
                    }
                }
            }
        }

        for (int k = 0; k < boards.length; k++) {
            for (int l = 0; l < boards[k].length; l++) {
                if (boards[k][l] == 0) {
                    answer += 1;
                }
            }
        }

        return answer;
    }

    public static void findBomb(int[][] boards, int x, int y) {
        if (boards[x][y] != 1) {
            boards[x][y] = -1;
        }
    }

    public static void main(String[] args) {
        int[][] boards = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        int[][] boards2 = {{0, 0, 1}, {0, 0, 0}, {0, 0, 0}};
        System.out.println(solution2(boards));
    }
}
