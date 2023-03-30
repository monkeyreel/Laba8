import java.util.Scanner;

import static functions.Functions.displayMatrix;

public class Zad7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите порядок матрицы:");
        int n = in.nextInt();
        while (n<0) {
            System.out.println("Повторите ввод!");
            n = in.nextInt();
        }
        int[][] arr = new int[n][n];
        chet(arr, n);
    }
    public static void fill(int[][] arr, int n) {
        int k = 0, score = 1;
        while (k<n) {
            for (int i = 0; i < n-k; i++) {
                arr[i][k] = score++;
            }
            for (int i=k+1;i<n;i++){
                arr[n-1-k][i] = score++;
            }
            k++;
        }
        displayMatrix(arr);
    }
}
