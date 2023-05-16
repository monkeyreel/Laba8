import java.util.Scanner;
public class Zad1 {
    public static void main(String[] args) {
        Scanner mc = new Scanner(System.in);
        System.out.println("Введите длину числа 10 is MAX");
        int m = mc.nextInt();
        int mas[] = new int[m];
        String chis = "";
        for (int i = 0; i <= m - 1; i++) {
            System.out.print("n" + i + " = ");
            int n = 0;
            int j = 0;
            while (j != 1) {
                System.out.print("");int b = mc.nextInt();
                if (b == 1 || b == 0) {
                    j += 1;
                    n = b;
                    chis += n;
                }
            }
            mas[i] = n;
        }
        int i = Integer.parseInt(chis);
        int desCh = Integer.parseInt(chis, 2);
        int mas2[] = new int[m];
        int h = 0;
        while (desCh > 0) {
            mas2[h] = desCh % 6;
            desCh /= 6;
            h++;
        }
        prmas(mas2);
    }
    public static void prmas(int [] mas){
        for (int i=mas.length-1;i>=0;i--){
            if (mas[i]!=0){
                System.out.print(mas[i]);
            }

        }
    }
}
