import static java.lang.System.out;
import static java.lang.Math.*;
import java.util.Scanner;
public class Zad9 {
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("Введите n - половина матрицы");
        int n = scan.nextInt();
        int [][] myMas2 = new int [2*n][2*n];
        MMM(myMas2,n,1);MMM(myMas2,n,1);MMM(myMas2,n,2);MMM(myMas2,n,3);MMM(myMas2,n,4);
        printMas2(myMas2);
    }
    public static void MMM(int [][]myMas2,int n,int pp){
        if(pp==1||pp==2) {
            int k = 0, minN = 0, sch = 1;
            while (k <= ceil(n / 3)) {
                for (int i = n; i < 2 * n - minN; i++) {
                    myMas2[minN + numb(pp) * n][i] = sch++;
                }
                for (int j = 1 + minN; j < n - minN; j++) {
                    myMas2[j + numb(pp)*n][2 * n - 1 - minN] = sch++;
                }
                for (int i = 2 * n - 2 - minN; i >= n; i--) {
                    myMas2[numb1(pp) * n - 1 - minN][i] = sch++;
                }
                k++;
                minN++;
            }
        }
        else{
            int k=0,sch = 1,minN=0;
            while (k<=ceil(n/3)) {
                for (int i =numb(pp)*n + minN; i<numb1(pp)*n-minN; i++) {
                    myMas2[i][minN] = sch++;
                }
                for (int j = 1+minN; j<n-minN; j++) {
                    myMas2[numb1(pp)*n-1- minN][j] = sch++;
                }
                for (int i=numb1(pp)*n-2-minN; i>=numb(pp)*n+minN; i--) {
                    myMas2[i][n-1-minN] = sch++;
                }
                for (int j=n-2-minN; j>minN; j--) {
                    myMas2[numb(pp)*n+minN][j] = sch++;
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
    public static void printMas2(int[][] array) {
        for (int i=0; i<=array.length-1; i++) {
            for (int j=0; j<=array[0].length-1; j++) {
                out.print(array[i][j]+"\t");
            }
            out.println();
        }
    }
}
