import java.util.Scanner;

public class ShannonEntropy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(); // max possible integer
        int[] counts = new int[m + 1];
        int total = 0;

        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            if (value >= 1 && value <= m) {
                counts[value]++;
                total++;
            }
        }

        double entropy = 0.0;
        for (int i = 1; i <= m; i++) {
            if (counts[i] > 0) {
                double p = (double) counts[i] / total;
                entropy -= p * (Math.log(p) / Math.log(2));
            }
        }

        System.out.printf("%.4f\n", entropy);
    }
}
