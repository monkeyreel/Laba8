import static java.lang.System.out;
import static java.lang.Math.*;
import java.util.Scanner;
public class Zad8 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите n - половина матрицы");
        int n = scan.nextInt();
        int[][] myMas2 = new int[2 * n][2 * n];
        MMM(myMas2,n,1);MMM(myMas2,n,2);MMM(myMas2,n,3);MMM(myMas2,n,4);
        printMas2(myMas2);
    }
    public static void MMM(int[][] myMas2,int n,int pp){
        int k = 0, sch = 1;
        while (k <= ceil(n / 3)) {
            for (int i = numb(pp,n); i <numb1(pp)*n - 1; i++) {
                int y = i + 1;
                for (int x = numb2(pp,n); x < numb3(pp)*n - i; x++) {
                    if (myMas2[x][i] == 0) {
                        myMas2[x][i] = sch++;
                    }
                }
                for (int x = i * 2; x < numb4(pp)*n - 1; x++) {
                    myMas2[pp*n - x - 2][y] = sch++;
                    y++;
                }k++;
            }
        }
    }
    public static int numb(int m,int n){
        if (m==1||m==2){return 0;}
        return n;}
    public static int numb1(int n){
        if(n==1||n==2){return 1;}
        return 2;}
    public static int numb2(int m,int n){
        if (m ==2||m ==4){return n;}
        return 0;}
    public static int numb3(int n){
        if (n ==2||n ==3){return 2;}
        else if (n==4) {return 3;}
        return 1;}
    public static int numb4(int n){
        if (n ==1||n ==2){return 1;}
        return 3;}
    public static void printMas2(int[][] array) {
        for (int i=0; i<=array.length-1; i++) {
            for (int j=0; j<=array[0].length-1; j++) {
                out.print(array[i][j]+"\t");
            }
            out.println();
        }
    }
}
