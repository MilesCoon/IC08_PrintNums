import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("PrintNums:");
        printNums(num);
        System.out.println("\nPrintNumsAscending");
        printNumsAscending(num);
        System.out.println("HarmonicSeries\n" + harmonicSeries(num));

    }

    public static void printNums(int n) throws InterruptedException {
        if (n > 1) {
            System.out.print(n + ", ");
            printNums(n - 1);
        }
        else if (n == 1) {
            System.out.print(n);
        }
        else {
            throw new IllegalArgumentException("n must be > 0");
        }
    }

    public static void printNumsAscending(int n) {
        printNumsAscendingRec(1, n);
    }
    private static void printNumsAscendingRec(int count, int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be >= 1");
        } else if (count == n) {
            System.out.println(n);
        } else {
            System.out.print(count + ", ");
            printNumsAscendingRec(count + 1, n);
        }
    }

    public static double harmonicSeries(int n) {
        if (n > 0) {
            return (1.0 / n) + harmonicSeries(n - 1);
        } else if (n == 0) {
            return 0.0;
        } else { throw new IllegalArgumentException("n must be >= 0"); }
    }
}