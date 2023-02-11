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
}