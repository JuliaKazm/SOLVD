import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, my name is Julia! This is my first Java program and it's awesome!");

        for (int i = 1; i <= 7; i=i+2) {

            System.out.println("i = " + i);
        }
        userInfo("Julia");
        userInfo("Jose");
        int[] arr = {5, 9, 4, 6, 5, 3, 2, 1, 22, 756, 45, 4, 2};

        quickSort(arr, 0, arr.length-1);
        // System.out.println(arr.toString());
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j <= arr.length-1; j++) {

            System.out.println("arr " + arr[j]);
        }
    }
    public static void userInfo(String name){
        if(name.equals("Jose")) {
        // if(name=="Vlad") {
            System.out.println("Sorting algorithm for " + name);
        }
    }
    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }
    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
