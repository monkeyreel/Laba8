import static functions.Functions.*;


public class Zad3 {
    public static void main(String[] args) {
        int len = 2 * lenArr();
        System.out.println("Максимальное расстояние между точками: " + maxDistance(len));
        System.out.println("Минимальное расстояние между точками: " + minDistance(len));
    }
}