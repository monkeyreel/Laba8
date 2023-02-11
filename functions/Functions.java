package functions;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Functions {
    public static String transNum(int num, int del) {
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            result.append(num % del);
            num /= del;
        }
        return new StringBuilder(result.toString()).reverse().toString();
    } // Перевод числа в другую систему счисления

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
    } // Новый массив двоичных элементов

    public static String[] newAllArr(int len) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[len];
        int i = 0;
        while (i < len) {
            int in1 = in.nextInt();
            arr[i] = String.valueOf(in1);
            i++;
        }
        return arr;
    } // Новый массив с любыми элементами

    public static Boolean isFibonacci(long num) {
        double tmp = 5 * num * num - 4;
        double tmp1 = 5 * num * num + 4;
        double sq = (long) Math.sqrt(tmp);
        double sq1 = (long) Math.sqrt(tmp1);
        return sq * sq == tmp || sq1 * sq1 == tmp1;
    } // Проверка на число Фибоначчи

    public static void isFibonacciArr(int len, String arr) {
        int k = 0;
        int[] subArr = new int[len];
        for (int i = 0; i < len; i++) {
            int num = parseInt(String.valueOf(arr.charAt(i)), 10);
            if (isFibonacci(num)) {
                k++;
                subArr[i] = num;
            }
        }
        String[] subArr2 = new String[len];
        if (k == len) {
            Arrays.sort(subArr);
            for (int i = 0; i < len; i++) {
                subArr2[i] = String.valueOf(subArr[i]);
            }
            if (arr.equals(String.join("", subArr2))) {
                System.out.println("В точности числа Фибоначчи");
            } else {
                System.out.println("Числа Фибоначчи с перестановками");
            }
        } else {
            double pro;
            double k1;
            k1 = k;
            pro = (k1 / len) * 100;
            String result = String.format("%.1f", pro);
            System.out.println("Чисел Фибоначчи в массиве: " + result + "%");
        }
    } // Проверка массива на числа Фибоначчи

    public static int lenArr() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        return in.nextInt();
    } // Функция ввода длины массива

    public static double distanceNum(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2*x2-x1*x1),2) + Math.pow((y2*y2-y1*y1),2));
    }

    public static double maxDistance(int len) {
        String[] arr = newAllArr(len);
        double maxNum1 = Math.max((distanceNum(Double.parseDouble(arr[0]), Double.parseDouble(arr[1]), Double.parseDouble(arr[2]), Double.parseDouble(arr[3]))), distanceNum(Double.parseDouble(arr[0]), Double.parseDouble(arr[1]), Double.parseDouble(arr[4]), Double.parseDouble(arr[5])));
        return Math.max(maxNum1, distanceNum(Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Double.parseDouble(arr[5]), Double.parseDouble(arr[5])));
    }

    public static double minDistance(int len) {
        String[] arr = newAllArr(len);
        double minNum1 = Math.min((distanceNum(Double.parseDouble(arr[0]), Double.parseDouble(arr[1]), Double.parseDouble(arr[2]), Double.parseDouble(arr[3]))), distanceNum(Double.parseDouble(arr[0]), Double.parseDouble(arr[1]), Double.parseDouble(arr[4]), Double.parseDouble(arr[5])));
        return Math.min(minNum1, distanceNum(Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Double.parseDouble(arr[5]), Double.parseDouble(arr[5])));
    }
}