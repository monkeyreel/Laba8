import static functions.Functions.*;

public class Zad5 extends Thread {
    public static void main(String[] args) {
        int [][] matrix = newMatrix();
        displayMatrix(matrix);
        displayMatrix(swapMatrix(matrix));
    }
}
