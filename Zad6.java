import java.util.Random;
import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        System.out.println("Введите число N");
        int n = ms.nextInt();
        System.out.println("Введите параметр δ ");
        double m = ms.nextDouble();
        int[][] mas_2 = new int[n][3];
        Random ran = new Random();
        for (int i = 0; i < n; i++) {
            mas_2[i][0] = ran.nextInt(40, 100);
            mas_2[i][1] = ran.nextInt(120, 200);
            mas_2[i][2] = ran.nextInt(2, 8);
        }
        double k = 0;int[] Unik=new int[3];int Uni=0;
        for (int i = 0; i < n; i++) {
            if (mas_2[i][2]>Uni){
                Uni=mas_2[i][2];
                Unik[0] = mas_2[i][0];
                Unik[1] = mas_2[i][1];
                Unik[2] = mas_2[i][2];
            }
        }
        int cnt=0,sum3=0;
        for (int i =0;i<n;i++) {
            sum3 += mas_2[i][2];
        }
        double sr3=sum3/n;
        for (int i = 0;i<n;i++){
            if(mas_2[i][2]+m>=sr3){
                mas_2[i][2]=1;
                cnt++;
            }
        }
        printMas2(Unik); System.out.println(cnt+" - кол-во уникальных людей");
    }
    public static void printMas2(int[] mas) {
        for (int i=0; i<=mas.length-1; i++) {
            System.out.print(mas[i]+"\t");
        }
    }
}
