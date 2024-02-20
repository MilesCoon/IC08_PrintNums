import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] data = {1,2,6,4,3,2};
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("PrintNums:");
        printNums(num);
        System.out.println("\nPrintNumsAscending");
        printNumsAscending(num);
        System.out.println("HarmonicSeries\n" + harmonicSeries(num));
        System.out.println("countNumberOf(2, data) = " + countNumOf(2, data));

    }

    public static int countNumOf(int value, int[] array) {
        return countNumOfRec(value, array, 0, 0);
    }

    private static int countNumOfRec(int value, int[] array, int count, int i) {
        if (i >= array.length) {
            return count;
        } else {
            if (array[i] == value) {
                count++;
            }
            return countNumOfRec(value,array,count,i+1);
        }
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