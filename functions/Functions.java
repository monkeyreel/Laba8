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

    public static String newArr(int len) {
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
}