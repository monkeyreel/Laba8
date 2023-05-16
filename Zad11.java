import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.System.out;

public class Zad11 {
    public static void main(String[] args) {
        Scanner mc = new Scanner(System.in);
        out.println("Введите N");
        int n = mc.nextInt(), cnt = 0;                              //2                  //3
        int[][] mas_1 = new int[2][4 * n];
        double [][] mas_con = new double[4][n];                             //1                   //4
        System.out.println("Вводите четырёхугольник последовательно, т.е. Картинка сверху");
        for (int i = 0; i <= 4 * n - 1; i++) {
            if (i % 4 == 0) {
                cnt++;}
            System.out.print("vvedi x" + (i % 4 + 1));
            out.print(" ");mas_1[0][i] = mc.nextInt();
            System.out.print("vvedi y" + (i % 4 + 1));
            out.print(" ");mas_1[1][i] = mc.nextInt();
        }
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                if(mas_1[0][i]>mas_1[0][j]){
//                    int c = mas_1[0][i], m= mas_1[1][i];
//                    mas_1[0][i]=mas_1[0][j];                       что то не выходит сортировка   :(((((
//                    mas_1[1][i]=mas_1[1][j];
//                    mas_1[0][j]=c;mas_1[1][j]=m;}
//                }
//            }
        for (int i = 0; i < n; i++) {
            double ab = sqrt((pow(mas_1[0][i + 1] - mas_1[0][i], 2) + pow(mas_1[1][i + 1] - mas_1[1][i], 2)));
            double bc = sqrt((pow(mas_1[0][i + 2] - mas_1[0][i + 1], 2) + pow(mas_1[1][i + 2] - mas_1[1][i + 1], 2)));
            double cd = sqrt((pow(mas_1[0][i + 3] - mas_1[0][i + 2], 2) + pow(mas_1[1][i + 3] - mas_1[1][i + 2], 2)));
            double da = sqrt((pow(mas_1[0][i] - mas_1[0][i + 3], 2) + pow(mas_1[1][i] - mas_1[1][i + 3], 2)));

            double ac = sqrt(pow(mas_1[0][i + 2] - mas_1[0][i], 2) + pow(mas_1[1][i + 2] - mas_1[1][i], 2));
            double bd = sqrt(pow(mas_1[0][i + 3] - mas_1[0][i+1], 2) + pow(mas_1[1][i + 3] - mas_1[1][i+1], 2));

            double cosBAD=(-pow(bd,2)+pow(ab,2)+pow(da,2))/(2*ab*da);//Для площади трапеции
            double sinBAD=sqrt(1-(pow(cosBAD,2)));
            double cosBCD=(-pow(bd,2)+pow(bc,2)+pow(cd,2))/(2*bc*cd);
            double sinBCD=sqrt(1-(pow(cosBCD,2)));//

            double m = Math.toDegrees(acos(cosBCD));double z=Math.toDegrees(acos(cosBAD));
            if ((ab<bc+cd+da & bc<ab+cd+da & cd<bc+ab+da & da<bc+cd+ab)||(ab==bc & bc==cd & cd==da & da==ab)) {
                mas_con[0][i] = 1;}
            else {mas_con[0][i]=0;mas_con[1][i]=0;mas_con[2][i]=0;mas_con[3][i]=0;}

            if (ab == bc & bc == cd & cd == da & da == ab & ac == bd) {//"1) Существует ли? 2) какой четырехуголь-ник? 3) какова площадь? 4) можно ли вписать в окружность?"//
                mas_con[1][i] = 2; mas_con[2][i]= (ab*bc);mas_con[3][i]=1;}
            else if (ab == bc & bc == cd & cd == da & da == ab & ac != bd) {
                mas_con[1][i] = 3;mas_con[2][i]=  ((ac*bd)/2);mas_con[3][i]=-1;}
            else if (ab == cd & bc == da & ac == bd) {
                mas_con[1][i] = 1; mas_con[2][i]= (ab*bc);mas_con[3][i]=1;}
            else if ((int) (pow(ac, 2) + pow(bd, 2)+1)== (int) (pow(ab, 2) + pow(cd, 2) + 2 * bc * da)) {
                mas_con[1][i] = 4;mas_con[2][i] = (((bc+da)/2)*sqrt(pow(ab,2)-pow((pow(bc-da,2)+pow(ab,2)-pow(cd,2))/(2*(bc-da)),2)));//2-it's square через 4 стороны трапеции
                if (ab==cd){mas_con[3][i]=1;}
                else mas_con[3][i]=-1;
            }
            else {mas_con[1][i]=5;mas_con[2][i]= ((ab*da*sinBAD+bc*cd*sinBCD)/2);if (m+z==180){
                mas_con[3][i]=1;}
            else mas_con[3][i]=-1;}

        }
        printMas2(mas_con);
    }
    public static void printMas2(double[][] array) {
        for (int i=0; i<=array.length-1; i++) {
            for (int j=0; j<=array[0].length-1; j++) {
                out.print(array[i][j]+"\t");
            }
            out.println();
        }
    }
}
