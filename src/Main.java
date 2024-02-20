import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        printNums(num);
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
}