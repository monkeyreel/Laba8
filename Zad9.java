import static java.lang.System.out;
import static java.lang.Math.*;
import java.util.Scanner;
public class Zad9{
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("Введите n - половина матрицы");
        int n = scan.nextInt();
        int [][] massiv = new int [2*n][2*n];
        MMM(massiv,n,1);MMM(massiv,n,1);MMM(massiv,n,2);MMM(massiv,n,3);MMM(massiv,n,4);
        masPrint(massiv);
    }
    public static void MMM(int [][]massiv,int n,int pp){
        if(pp==1||pp==2) {
            int k = 0, minN = 0, sch = 1;
            while (k <= ceil(n / 3)) {
                for (int i = n; i < 2 * n - minN; i++) {
                    massiv[minN + numb(pp) * n][i] = sch++;
                }
                for (int j = 1 + minN; j < n - minN; j++) {
                    massiv[j + numb(pp)*n][2 * n - 1 - minN] = sch++;
                }
                for (int i = 2 * n - 2 - minN; i >= n; i--) {
                    massiv[numb1(pp) * n - 1 - minN][i] = sch++;
                }
                k++;
                minN++;
            }
        }
        else{
            int k=0,sch = 1,minN=0;
            while (k<=ceil(n/3)) {
                for (int i =numb(pp)*n + minN; i<numb1(pp)*n-minN; i++) {
                    massiv[i][minN] = sch++;
                }
                for (int j = 1+minN; j<n-minN; j++) {
                    massiv[numb1(pp)*n-1- minN][j] = sch++;
                }
                for (int i=numb1(pp)*n-2-minN; i>=numb(pp)*n+minN; i--) {
                    massiv[i][n-1-minN] = sch++;
                }
                for (int j=n-2-minN; j>minN; j--) {
                    massiv[numb(pp)*n+minN][j] = sch++;
                }
                k++;
                minN++;
            }
        }
    }
    public static int numb(int n){
        if (n==1||n==3){return 0;}
        return 1;}
    public static int numb1(int n){
        if(n==1||n==3){return 1;}
        return 2;}
    public static void masPrint(int[][] array) {
        for (int i=0; i<=array.length-1; i++) {
            for (int j=0; j<=array[0].length-1; j++) {
                out.print(array[i][j]+"\t");
            }
            out.println();
        }
    }
}
