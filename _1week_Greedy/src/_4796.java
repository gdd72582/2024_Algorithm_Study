import java.util.Scanner;

public class _4796 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseCount = 1;
        int[] maxcampingArray = new int[100];
        int arrayConut = 0;
        while (true) {
            int L = scanner.nextInt();
            int P = scanner.nextInt();
            int V = scanner.nextInt();
            if (L == 0 && P == 0 && V == 0)
                break;
            int maxCampingDays = (V / P) * L;

            maxCampingDays += Math.min(V % P, L);
            maxcampingArray[arrayConut] = maxCampingDays;
            arrayConut++;
            caseCount++;
        }
        for (int i = 0; i < maxcampingArray.length; i++) {
            if (maxcampingArray[i] == 0)
                break;
            System.out.println("Case " + (i+1) + ": " + maxcampingArray[i]);

        }
        scanner.close();
    }
}

