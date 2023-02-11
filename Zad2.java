import java.util.Scanner;
import java.util.Arrays;
import static functions.Functions.*;
import static java.lang.Integer.parseInt;

public class Zad2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int len = in.nextInt();
        String arr = newAllArr(len);
        int k = 0;
        int[] subArr = new int[len];
        for (int i=0;i<len;i++) {
            int num = parseInt(String.valueOf(arr.charAt(i)), 10);
            if (isFibonacci(num)) {
                k++;
                subArr[i] = num;
            }
        }
        String[] subArr2 = new String[len];
        if (k==len) {
            Arrays.sort(subArr);
            for (int i=0;i<len;i++) {
                subArr2[i] = String.valueOf(subArr[i]);
            }
            if (arr.equals(String.join("", subArr2))) {
                System.out.println("В точности числа Фибоначчи");
            }
            else {
                System.out.println("Числа Фибоначчи с перестановками");
            }
        }
        else {
            double pro;
            double k1;
            k1 = k;
            pro = (k1 / len) * 100;
            String result = String.format("%.1f",pro);
            System.out.println("Чисел Фибоначчи в массиве: " + result + "%" );
        }




    }
}
