import java.util.Random;
import java.util.Arrays;
public class QuickSort {
    public void quicksort(int[] arr, int left, int right) {
        int pivotIndex = partition(arr, left, right);
        if(left < pivotIndex - 1) {
            quicksort(arr, left, pivotIndex - 1);
        }
        if(right > pivotIndex) {
            quicksort(arr, pivotIndex, right);
        }
    }

    public int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        while(left <= right) {
            while(arr[left] < pivot) {
                left++;
            }
            while(arr[right] > pivot) {
                right--;
            }
            if(left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 20, 15, 10, 9, 1, 5};
        QuickSort sorter = new QuickSort();
        sorter.quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 5, 7, 9, 10, 15, 20]
    }
}

// Сравнение сортировки "пузырек" и быстрой сортировки с использованием промежуточных результатов

