import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class Zad12 {
    public static void main(String[] args) {
        Scanner mc =new Scanner(System.in);
        System.out.println("Введите N");
        int n = mc.nextInt();
        int[][] mas_1=new int[n][n];
        int[] masF =new int[n];
        int[] masX =new int[n];
        int[] masSR=new int[n];
        System.out.println("Заполните коэффициенты, заполняйте так- 1 строка, все столбцы, 2 строка и т.д.");
        int j,i;
        for (i=0;i<n;i++){
            for(j=0;j<n;j++){
                mas_1[i][j]= mc.nextInt();
            }
        }
        printMas2(mas_1);
        System.out.println("Заполните F и X");
        for (i=0;i<n;i++){
            System.out.print("F= ");
            out.print("");masF[i]= mc.nextInt();
            System.out.print("X= ");
            out.print("");masX[i]= mc.nextInt();
        }
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                masSR[i]+=mas_1[i][j]*masX[j];
            }
        }
        if (Arrays.equals(masF,masSR)){
            System.out.println("СЛАУ задано верно");
        }
        else System.out.println("СЛАУ задано не верно");
    }
    public static void printMas2(int[][] array) {
        for (int i=0; i<=array.length-1; i++) {
            for (int j=0; j<=array[0].length-1; j++) {
                out.print(array[i][j]+"\t");
            }
            out.println();
        }
    }
}
