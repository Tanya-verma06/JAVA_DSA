package Recursion;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {3,5,4,7,6,8,9};
        quickSort(arr,0,arr.length-1);

        for(int x = 0 ; x<arr.length;x++);

    }
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    static int partition(int[] arr , int low , int high){

        int pivot = arr[high];
        int i = low-1;
        for(int j = low ; j < high; j++){
            if(arr[j]<pivot){
                i++;


                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }

        int temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;

    }



}
