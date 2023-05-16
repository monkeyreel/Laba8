import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class Zad3 {
    public static void main(String[] args) {
        Scanner mc = new Scanner(System.in);
        System.out.println("vvedi n");
        int n = mc.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        Random ran = new Random();
        int mas_1[] = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            mas_1[i] = ran.nextInt(7,66);
        }
        int k = (int) Math.sqrt(Math.pow((mas_1[3] - mas_1[1]),2) + Math.pow((mas_1[2] - mas_1[0]),2));
        int k1=k;
        int x11=0, y11=0, x22=0, y22=0, x1=0, y1=0, x2=0, y2=0;
        for (int i = 0; i < 2 * n; i += 2) {
            for (int j = i+2; j < 2 * n; j += 2) {
                if (Math.sqrt(Math.pow((mas_1[j] - mas_1[i]), 2) + Math.pow((mas_1[j + 1] - mas_1[i + 1]), 2)) > k) {
                    k = (int) (Math.sqrt(Math.pow((mas_1[j] - mas_1[i]), 2) + Math.pow((mas_1[j + 1] - mas_1[i + 1]), 2)));
                    x1 = mas_1[i];
                    y1 = mas_1[i + 1];
                    x2 = mas_1[j];
                    y2 = mas_1[j + 1];
                }
            }
        }
        for (int i = 0; i < 2 * n; i += 2) {
            for (int j = i; j < 2 * n; j += 2) {
                if (Math.sqrt(Math.pow((mas_1[j] - mas_1[i]), 2) + Math.pow((mas_1[j + 1] - mas_1[i + 1]), 2)) < k1 & mas_1[i]!=mas_1[j] & mas_1[j+1]!=mas_1[i+1]) {
                    k1 = (int) (Math.sqrt(Math.pow((mas_1[j] - mas_1[i]), 2) + Math.pow((mas_1[j + 1] - mas_1[i + 1]), 2)));
                    x11 = mas_1[i];
                    y11 = mas_1[i + 1];
                    x22 = mas_1[j];
                    y22 = mas_1[j + 1];
                }
            }
        }
        System.out.println(x1 + " " + y1 + "  " + x2 + " " + y2 + " расстояние = "+ k);
        System.out.println(x11 + " " + y11 + "  " + x22 + " " + y22 +" расстояние = "+ k1);
        printmas_1(mas_1);

    }
    public static void printmas_1(int[] array) {
        for (int i=0; i<=array.length-1; i++) {
            out.print(array[i]+"\t");
        }
    }
}
