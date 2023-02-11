import java.util.Scanner;
import static functions.Functions.*;
import static java.lang.Integer.parseInt;

public class Zad1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int len = in.nextInt();
        System.out.println(transNum(parseInt(newBinaryArr(len),2), 6));

    }
}
