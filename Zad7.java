import java.util.Scanner;
public class Zad7 {
    public static void main(String[] args) {
        Scanner chis = new Scanner(System.in);
        System.out.println("Введите N");
        int n = chis.nextInt();
        int[][] mas = new int[n][n];
        int sch = 1;int m=n;
        for (int i = 0; i < n; i++) {
            for (int g = 0; g < m; g++) {
                mas[g][i] = sch++;
                if (g == m - 1) {
                    for (int a = i + 1; a < n; a++) {
                        mas[g][a] = sch++;
                    }
                    m--;
                }
            }
        }
        printMas(mas);
    }
    public static void printMas(int[][] array) {
        for (int i=0; i<=array.length-1; i++) {
            for (int j=0; j<=array[0].length-1; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
