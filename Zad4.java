

import java.util.Arrays;

public class Zad4 {
    public static void main(int[] mas,int niz, int verh) {
        int k=0;
        if (mas.length==0)
            return;
        if(niz>=verh)
            return;
        int seredina=niz+(verh-niz)/2;
        int pivot=mas[seredina];
        int i=niz,j=verh;
        while (i<=j) {
            k++;
            while (mas[i] < pivot) {
                i++;
            }
            while (mas[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = mas[i];
                mas[i] = mas[j];
                mas[j] = temp;
                i++;
                j--;
            }
        }
        if (niz<j)
            main(mas,niz,j);
        if (verh>i)
            main(mas,i,verh);
        if (k==3) System.out.println(Arrays.toString(mas)+" Сравнение на 3 цикле.");
    }
    public static void main(String[] args) {
        int[] x = {8,80,0,55,5,35,3,5};
        int[] y = {8,80,0,55,5,35,3,5};
        int counter = 0; int temp; int low = 0; int high = x.length - 1;
        System.out.println("Было");
        System.out.println(Arrays.toString(x));
        main(x, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
        boolean isSorted = false; // Пузырек
        System.out.println("Было");
        System.out.println(Arrays.toString(y));
        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < x.length - 1; j++) {
                if (y[j] > y[j + 1]) {
                    temp = y[j];
                    y[j] = y[j + 1];y[j + 1] = temp;
                    isSorted = false;
                    counter++;
                    if (counter == 3) System.out.println(Arrays.toString(x) + " Cравнение пузырька на 3 цикле");
                }
            }
        }
        System.out.println("Стало");
        System.out.println(Arrays.toString(y));
    }
}
