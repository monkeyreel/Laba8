import java.util.Scanner;

import static functions.Functions.displayMatrix;

public class Zad8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите порядок матрицы:");
        int n = in.nextInt();
        while (n<0) {
            System.out.println("Повторите ввод!");
            n = in.nextInt();
        }
        int[][] arr = new int[n][n];
        fill1(arr, n);
        fill2(arr, n);
        fill3(arr, n);
        fill4(arr, n);
        displayMatrix(arr);
    }

    public static void fill1(int[][] arr, int n) {
        int k=0, score=1;
        while (k<n/4.f) {
            for (int i=0; i<n/2-1-2*k; i++) {
                arr[i][k] = score++;
            }
            for (int i=0; i<=n/2-1-2*k;i++) {
                arr[n/2-1-i-2*k][i+k] = score++;
            }
            k++;
        }
    }
    public static void fill2(int[][] arr, int n) {
        int k = 0, score = 1;

        while (k < n / 4.f) {
            for (int i = 0; i < n / 2 - 1 - 2 * k; i++) {
                arr[i][k+n/2] = score++;
            }
            for (int i = 0; i <= n / 2 - 1 - 2 * k; i++) {
                arr[n / 2 - 1 - i - 2 * k][i + k+n/2] = score++;
            }
            k++;
        }
    }
    public static void fill3(int[][] arr, int n){
            int k = 0, score = 1;
            while (k < n / 4.f) {
                for (int i = 0; i < n / 2 - 1 - 2 * k; i++) {
                    arr[i+n/2][k] = score++;
                }
                for (int i = 0; i <= n / 2 - 1 - 2 * k; i++) {
                    arr[n - 1 - i - 2 * k][i + k] = score++;
                }
                k++;
            }
        }
    public static void fill4(int[][] arr, int n) {
        int k = 0, score = 1;
        while (k < n / 4.f) {
            for (int i = 0; i < n / 2 - 1 - 2 * k; i++) {
                arr[i+n/2][k+n/2] = score++;
            }
            for (int i = 0; i <= n / 2 - 1 - 2 * k; i++) {
                arr[n - 1 - i - 2 * k][i + k+ n/2] = score++;
            }
            k++;
        }
    }

}
