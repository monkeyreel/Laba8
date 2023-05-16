

import java.util.Random;
import java.util.Scanner;
public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N");
        int n = scanner.nextInt();
        Random ran = new Random();
        int[][] mas_1 = new int[n][n];
        for (int i = 0; i < mas_1.length; i++) {
            for (int g = 0; g < mas_1[i].length; g++) {
                mas_1[i][g] = ran.nextInt(20);
            }
        }
        for (int i = 0; i < mas_1[0].length; i++) {
            for (int[] ints : mas_1) {
                System.out.print(ints[i] + "\t");
            }
            System.out.println();
        }
        System.out.println("");
        for (int i=0;i< mas_1[0].length;i++){       //Зеркало
            for (int g=0;g< mas_1.length;g++){
                System.out.print(mas_1[n-1-i][n-1-g]+"\t");
            }
            System.out.println("");
        }
    }
}
