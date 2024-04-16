import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextLong();
        }

        long maxProduct = getMaxPairwiseProduct(numbers);
        System.out.println(maxProduct);
    }

    private static long getMaxPairwiseProduct(long[] numbers) {
        int n = numbers.length;
        int maxIndex1 = -1;
        for (int i = 0; i < n; i++) {
            if (maxIndex1 == -1 || numbers[i] > numbers[maxIndex1]) {
                maxIndex1 = i;
            }
        }
        int maxIndex2 = -1;
        for (int i = 0; i < n; i++) {
            if (i != maxIndex1 && (maxIndex2 == -1 || numbers[i] > numbers[maxIndex2])) {
                maxIndex2 = i;
            }
        }
        return numbers[maxIndex1] * numbers[maxIndex2];
    }
}