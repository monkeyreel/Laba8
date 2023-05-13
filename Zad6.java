import functions.Functions;

import java.util.Scanner;

import static functions.Functions.displayMatrix;

public class Zad6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во людей:");
        int n = in.nextInt();
        while (n <= 0) {
            System.out.println("Вы допустили ошибку, повторите ввод!");
            n = in.nextInt();
        }
        double[][] arr = new double[n][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j == 0) {
                    System.out.println("Введите массу " + (i + 1) + "-ого ученика");
                    arr[i][j] = in.nextDouble();
                }
                if (j == 1) {
                    System.out.println("Введите рост " + (i + 1) + "-ого ученика");
                    arr[i][j] = in.nextDouble();
                }
                if (j == 2) {
                    System.out.println("Введите успеваемость " + (i + 1) + "-ого ученика");
                    arr[i][j] = in.nextDouble();
                }
                if (j == 3) {
                    System.out.println("Введите численность семьи " + (i + 1) + "-ого ученика");
                    arr[i][j] = in.nextDouble();
                }

            }
        }
        disMatN(arr);
        SrZnach(arr);
        disMatN(ModuleRaz(arr));
        System.out.println("Введите дельта-окрестность: ");
        double delta = in.nextDouble();
        Max(ModuleRaz(arr));
        SrStat(ModuleRaz(arr), delta);
    }

    public static double SrZnach(double[][] arr) {
        double S = 0;
        for (int i = 0; i < arr.length; i++) {
            S += arr[i][3];
        }
        return S / arr.length;
    }

    public static double[][] ModuleRaz(double[][] arr) {
        double S = SrZnach(arr);
        double[][] arr1 = new double[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            arr1[i][0] = i + 1;
        }
        for (int j = 0; j < arr.length; j++) {
            arr1[j][1] = Math.abs(S - arr[j][3]);
        }
        return arr1;
    }

    public static void disMatN(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {  //идём по строкам
            for (int j = 0; j < arr[0].length; j++) {//идём по столбцам

                System.out.print("\t" + arr[i][j] + "\t"); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
        System.out.println();
    }

    public static void disMat1(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void Max(double[][] arr) {
        double maxP = 0;
        int ind = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1] > maxP) {
                maxP = arr[i][1];
                ind = i;
            }
        }
        System.out.println("Уникальный ученик: " + (ind + 1) + "\t" + " Отличие от Ср.знач: " + maxP);
    }


    public static void SrStat(double[][] arr, double delta) {
        int k = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i][1] <= delta) {
                k+=1;
            }
        }
        System.out.println("Количество среднестат. учеников: " + k);
    }
}