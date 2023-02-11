import static functions.Functions.*;
import static functions.Functions.lenArr;


public class Zad2 {
    public static void main(String[] args) {
        int len = lenArr();
        isFibonacciArr(len, String.join("", newAllArr(len)));
    }
}
