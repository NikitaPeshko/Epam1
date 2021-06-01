import java.util.ArrayList;
import java.util.Arrays;


public class QuickSort {
    public static void main(String[] args) {
        int[] array = { 4, 6, 5, 3, 1, 7, 2,10 };

        System.out.println(Arrays.toString(array) + " - unsorted");
        System.out.println();

        quickSort(array, 0, array.length - 1);


        System.out.println(Arrays.toString(array) + " - sorted");
        System.out.println();

        String[] Stringarray = { "lesha", "nikita", "pasha", "koly", "max", "anton","alex" };

        System.out.println(Arrays.toString(Stringarray) + " - unsorted");
        System.out.println();

        quickSortString(Stringarray, 0, Stringarray.length - 1);


        System.out.println(Arrays.toString(Stringarray) + " - sorted");
        System.out.println();
    }

    public static int partition(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int temp;
        int pivotIndex = (left + right) / 2;
        int pivot = array[(left + right) / 2];
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("left index: " + left + ", right index: " + right + ", pivot index: " + pivotIndex + ", pivot element: " + pivot);

        for (int k = left; k <= right; k ++) {
            list.add(array[k]);
        }
        System.out.println("sub array: " + list);

        while (i <= j) {
            // search for an element greater than or equal to pivot
            while (array[i] < pivot) {
                i++;
            }
            // search for an element less than or equal to pivot
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                // swap
                // pivot elements get swapped  if the condition is met
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println();

        return i;
    }

    public static void quickSort(int[] array, int left, int right) {
        int index = partition(array, left, right);

        if (left < index - 1) {
            quickSort(array, left, index - 1);
        }
        if (index < right) {
            quickSort(array, index, right);
        }
    }

    public static void quickSortString(String[] array, int left, int right) {
        int index = partitionForString(array, left, right);

        if (left < index - 1) {
            quickSortString(array, left, index - 1);
        }
        if (index < right) {
            quickSortString(array, index, right);
        }
    }
    public static int partitionForString(String[] array, int left, int right) {
        int i = left;
        int j = right;
        String temp;
        int pivotIndex = (left + right) / 2;
        String pivot = array[(left + right) / 2];
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("left index: " + left + ", right index: " + right + ", pivot index: " + pivotIndex + ", pivot element: " + pivot);

        for (int k = left; k <= right; k ++) {
            list.add(array[k]);
        }
      //
        //  System.out.println("sub array: " + list);

        while (i <= j) {
            // search for an element greater than or equal to pivot
            while (array[i].compareTo(pivot)<0) {
                i++;
            }
            // search for an element less than or equal to pivot
            while (array[j].compareTo(pivot)>0) {
                j--;
            }
            if (i <= j) {
                // swap
                // pivot elements get swapped  if the condition is met
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println();

        return i;
    }
}
