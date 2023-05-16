import  java.util.Scanner;

import static java.lang.Math.pow;

public class Zad2 {
    public static void main(String[] args) {
        Scanner mc = new Scanner(System.in);
        System.out.println("Введите N");
        int N = mc.nextInt();
        int[] mas_User = new int[N+1];
        int[] mas_POL = new int[10 * N];
        int[] mas_Otr = new int[10 * N];
        System.out.println("Заполните массив");
        for (int i = 2; i < 10 * N; i++) {
            mas_POL[0] = 1;
            mas_POL[1] = 1;
            mas_POL[i] = mas_POL[i - 2] + mas_POL[i - 1];
        }
        for (int i = 0; i < 10 * N; i++) {
            mas_Otr[i] = (int) (pow(-1, i + 2) * mas_POL[i]);
        }
        int i = 0;
        for (i = 0; i < N; i++) {
            mas_User[i] = mc.nextInt();
        }
        int j = 0, k = 1, m = 0, chis = 0;
        for (i = 0; i <N;) {
            for (j = 0; j < 10 * N; j++) {
                if (mas_User[i] == mas_Otr[j]) {
                    chis++;
                    if (mas_Otr[j]==mas_User[i] & mas_User[i+1]==mas_Otr[j+1]) {
                        k++;
                        if (k > m) {
                            m = k;
                        }
                    }
                }
            }i++;j=0;
        }
        if (chis == k) {
            System.out.println("Является отрицательной веткой чисел Фибоначчи");}
        else System.out.println("Содержит- " + chis + " совпадений. "+ k +" Расположены последовательно.");
    }
}
