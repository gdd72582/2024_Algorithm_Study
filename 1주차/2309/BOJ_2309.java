package BOJ_1st_Week;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] heights = new int[9];

        for (int i = 0; i < 9; i++) { //9명의 키 입력
            heights[i] = scanner.nextInt();
        }

        findAndPrintSeven(heights);
    }

    private static void findAndPrintSeven(int[] heights) {
        int sum = Arrays.stream(heights).sum(); // 9 난쟁이 키 합계
        int match = sum - 100;

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (heights[i] + heights[j] == match) {
                    // 매칭된 두 키를 찾았을 때 바로 출력 후 종료
                    printResult(heights, i, j);
                    return;
                }
            }
        }
    }

    private static void printResult(int[] heights, int excludeIndex1, int excludeIndex2) {
        int[] result = new int[7];
        int resultIndex = 0;

        for (int i = 0; i < 9; i++) {
            if (i != excludeIndex1 && i != excludeIndex2) {
                result[resultIndex++] = heights[i]; //result 배열에 i와 j 번째 난쟁이를 제외한 후 대입
            }
        }

        Arrays.sort(result); //정렬

        for (int i = 0; i < 7; i++) {
            System.out.println(result[i]);
        }
    }
}
