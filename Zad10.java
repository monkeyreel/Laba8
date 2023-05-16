import java.util.Scanner;
import java.util.Random;
public class Zad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random run = new Random();
        int n= sc.nextInt();
        int[][] mas_1 = new int[2][n];
        for (int i=0;i<n;i++){//Заполнение массива автоматом//
            mas_1[0][i]= run.nextInt(-4,8);
            mas_1[1][i]=run.nextInt(-4,6);
        }
        for (int i=0;i<n;i++){
            int pop=FIGURE(mas_1[0][i],mas_1[1][i]);
            if (pop==1){
                System.out.println("Точка ("+mas_1[0][i]+";"+mas_1[1][i]+") Попала в область");
            }
            if (pop==-1) {
                System.out.println("Точка (" + mas_1[0][i] + ";" + mas_1[1][i] + ") Не попала в область");
            }
            if (pop==0) {
                System.out.println("Точка (" + mas_1[0][i] + ";" + mas_1[1][i] + ") Попала на границу");
            }
        }
    }
    public static int FIGURE(int x, int y) {
        if (fig_1(x,y)==1){
            return 1;
        }
        else if (fig_1(x,y)==0) {
            return 0;
        }
        else{
            return -1;
        }
    }
    public static int fig_1(double x, double y) {
        double v1 = Math.pow(x + 1, 2) + Math.pow(y - 1, 2), v2 = Math.pow(x - 4, 2) + Math.pow(y + 1, 2);
        if  (((x>=-1 & x<=1 & y>=-1 & y<=5 & y<-1.5*x+3.5 & y>3*x-1 & y>-2*x-1)||
                (y>=-1 & y<=3 & x>=-3 & x<=-1 & y<v1 & y>-v1))||(((x>=2 & x<=4 & y>=0 & y<=1 & y>-x+3)||(x>=2 & x<=3 & y<=0 & y>=-1 & y<x-3)||
                (y>x-7 & x>=4 & x<=6 & y>=-3 & y<=-1)||(x>=2 & x<=4 & y>=-3 & y<=-1 & y<-v2)||
                (x>=4 & x<=6 & y>=-1 & y<=1 & y<v2)))){return 1;}
        if ((x>-1 & x<=1 & y>=2 & y<=5 & y==-1.5*x+3.5)||(y==3*x+1&y>=-1&y<=2&0<=x&x<=1)
                ||(x>-1 & x<=0 & y<1 & y>=-1 & y==-2*x-1)||(x==-1 & y>=-1 & y<=1)||(x==-1 & y>=3 & y<=5)||(x>=-3 & x<=-1 & y<=3 & y>=-1 & 4==v1)
                ||(x>=2 & x<=4 & y<=-1 & y>=-3 & 4==v2)||(x>=4 & x<=6 & y<=1 & y>=-1 & 4==v2)||(x>=4 & x<=6 & y>=-3 & y<=-1 & y==x-7)||(y==1 & x>=2 & x<=4)
                ||(x>=2 & x<=3 & y<=1& y>=0 & y==-x+3)||(x>=2 & x<=3 & y<=0 & y>=-1 & y==x-3)) {return 0;}
        return -1;
    }
}
