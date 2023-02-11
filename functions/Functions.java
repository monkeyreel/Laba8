package functions;
import java.util.Scanner;

public class Functions {
    public static String transNum(int num, int del) {
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            result.append(num % del);
            num /= del;
        }
        return new StringBuilder(result.toString()).reverse().toString();
    }

    public static String newBinaryArr(int len) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[len];
        int i = 0;
        while (i < len) {
            int in1 = in.nextInt();
            if (in1 == 1 || in1 == 0) {
                arr[i] = String.valueOf(in1);
                i++;
            } else {
                System.out.println("Введите либо 0, либо 1");
            }
        }
        return String.join("", arr);
    }

    public static String newAllArr(int len) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[len];
        int i = 0;
        while (i < len) {
            int in1 = in.nextInt();
            arr[i] = String.valueOf(in1);
            i++;
        }
        return String.join("", arr);
    }

    public static Boolean isFibonacci(long num) {
        double tmp = 5 * num * num - 4;
        double tmp1 = 5 * num * num + 4;
        double sq = (long)Math.sqrt(tmp);
        double sq1 = (long)Math.sqrt(tmp1);
        return sq * sq == tmp || sq1 * sq1 == tmp1;
    }
}
