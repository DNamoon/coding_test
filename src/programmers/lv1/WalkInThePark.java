package programmers.lv1;

import java.nio.file.Path;
import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/172928
 * 공원 산책
 *
 * 지나다니는 길을 'O', 장애물을 'X'로 나타낸 직사각형 격자 모양의 공원에서 로봇 강아지가 산책을 하려합니다.
 * 산책은 로봇 강아지에 미리 입력된 명령에 따라 진행하며, 명령은 다음과 같은 형식으로 주어집니다.
 *
 * ["방향 거리", "방향 거리" … ]
 * 예를 들어 "E 5"는 로봇 강아지가 현재 위치에서 동쪽으로 5칸 이동했다는 의미입니다.
 * 로봇 강아지는 명령을 수행하기 전에 다음 두 가지를 먼저 확인합니다.
 *
 * 주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
 * 주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.
 * 위 두 가지중 어느 하나라도 해당된다면, 로봇 강아지는 해당 명령을 무시하고 다음 명령을 수행합니다.
 * 공원의 가로 길이가 W, 세로 길이가 H라고 할 때, 공원의 좌측 상단의 좌표는 (0, 0),
 * 우측 하단의 좌표는 (H - 1, W - 1) 입니다.
 * 공원을 나타내는 문자열 배열 park, 로봇 강아지가 수행할 명령이 담긴 문자열 배열 routes가 매개변수로 주어질 때,
 * 로봇 강아지가 모든 명령을 수행 후 놓인 위치를 [세로 방향 좌표, 가로 방향 좌표] 순으로 배열에 담아
 * return 하도록 solution 함수를 완성해주세요.
 */
public class WalkInThePark {
    public static int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int[] startPoint = findStartPoint(park);
        int startRow = startPoint[0];
        int startColum = startPoint[1];
        String[] parkRow = park[startRow].split("");

        for (String route : routes) {
            boolean isX = false;
            String[] command = route.split(" ");
            String direction = command[0];
            int distance = Integer.parseInt(command[1]);

            if ("E".equals(direction)) {
                if (startColum + distance > park[startColum].length() - 1) {
                    continue;
                }

                int tmp = startColum;
                for (int i = 1; i <= distance; i++) {
                    if ("X".equals(parkRow[tmp + i])) {
                        isX = true;
                        break;
                    }
                }

                if (!isX) {
                    startColum += distance;
                }

            } else if ("W".equals(direction)) {
                if (startColum + distance < 0) {
                    continue;
                }
                
                int tmp = startColum;
                for (int i = 1; i <= distance ; i++) {
                    if ("X".equals(parkRow[tmp - i])) {
                        isX = true;
                        break;
                    }
                }
                if (!isX) {
                    startColum -= distance;
                }
            } else if ("S".equals(direction)) {
                if (startRow + distance > park.length - 1) {
                    continue;
                }
                
                int tmp = startRow;
                for (int i = 1; i <= distance; i++) {
                    if ("X".equals(park[tmp + i].split("")[startColum])) {
                        isX = true;
                        break;
                    }
                }

                if (!isX) {
                   startRow += distance;
                }

            } else if ("N".equals(direction)) {
                if (startRow + distance < 0) {
                    continue;
                }

                int tmp = startRow;
                for (int i = 1; i <= distance; i++) {
                    if ("X".equals(park[tmp - i].split("")[startColum])) {
                        isX = true;
                        break;
                    }
                }
                if (!isX) {
                    startRow -= distance;
                }
            }
        }

        answer[0] = startRow;
        answer[1] = startColum;

        return answer;
    }

    public static int[] findStartPoint(String[] park) {
        int[] startPoint = new int[2];
        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                String[] strArr = park[i].split("");
                int k = 0;
                for (String s : strArr) {
                    if ("S".equals(s)) {
                        startPoint = new int[]{i, k};
                        return startPoint;
                    }
                    k++;
                }
            }
        }

        return startPoint;
    }

//    public static void findX(boolean isX, int startPoint, int distance, String[] park) {
//        int tmp = startPoint;
//        for (int i = 1; i <= distance; i++) {
//            if ("X".equals(parkRow[tmp + i])) {
//                isX = true;
//                break;
//            }
//        }
//    }

    public static int[] solution2(String[] park, String[] routes) {
        int[] answer = new int[2];
        int[] startPoint = findStartPoint(park);
        int startRow = startPoint[0];
        int startColum = startPoint[1];
        String[] parkRow = park[startRow].split("");

        for (String route : routes) {
            boolean isX = false;
            String[] command = route.split(" ");
            String direction = command[0];
            int distance = Integer.parseInt(command[1]);

            switch (direction) {
                case "E":
                    if (startColum + distance > park[startColum].length() - 1) {
                        continue;
                    }

                    int tmp = startColum;
                    for (int i = 1; i <= distance; i++) {
                        if ("X".equals(parkRow[tmp + i])) {
                            isX = true;
                            break;
                        }
                    }

                    if (!isX) {
                        startColum += distance;
                    }
                    break;

                case "W":
                    if (startColum + distance < 0) {
                        continue;
                    }

                    tmp = startColum;
                    for (int i = 1; i <= distance ; i++) {
                        if ("X".equals(parkRow[tmp - i])) {
                            isX = true;
                            break;
                        }
                    }
                    if (!isX) {
                        startColum -= distance;
                    }
                    break;

                case "S" :
                    if (startRow + distance > park.length - 1) {
                        continue;
                    }

                    tmp = startRow;
                    for (int i = 1; i <= distance; i++) {
                        if ("X".equals(park[tmp + i].split("")[startColum])) {
                            isX = true;
                            break;
                        }
                    }

                    if (!isX) {
                        startRow += distance;
                    }
                    break;

                case "N" :
                    if (startRow + distance < 0) {
                        continue;
                    }

                    tmp = startRow;
                    for (int i = 1; i <= distance; i++) {
                        if ("X".equals(park[tmp - i].split("")[startColum])) {
                            isX = true;
                            break;
                        }
                    }
                    if (!isX) {
                        startRow -= distance;
                    }
                    break;
            }
        }

        answer[0] = startRow;
        answer[1] = startColum;

        return answer;
    }


    public static void main(String[] args) {
        String[] park = {"OSO", "OOO", "OXO", "OOO"};
        String[] routes = {"E 2", "S 3", "W 1"};
//        System.out.println(Arrays.toString(findStartPoint(park)));
        System.out.println(Arrays.toString(solution2(park,routes)));
    }
}
