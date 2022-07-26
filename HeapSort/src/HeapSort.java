import java.util.Scanner;

public class HeapSort {
    private static void swapInArray(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    private static void addToHeap(int[] arr,int i){
        while (i!=0){
            if (arr[(i-1)/2]<arr[i]) {
                swapInArray(arr, (i-1) / 2, i);
                i=(i-1)/2;
            }
            else
                return;
        }
    }
    private static void buildHeap(int[] arr){
        for (int i=1;i<arr.length;i++)
            addToHeap(arr,i);
    }
    private static void rebuild(int[] arr,int len){
        int i=0;
        while (2*i+1<len) {
            int indexOfMaxChild = 2*i+1;
            if (2*i+2<len && arr[2*i+2]>arr[2*i+1])
                indexOfMaxChild = 2*i+2;
            if (arr[i]<arr[indexOfMaxChild]) {
                swapInArray(arr, i, indexOfMaxChild);
                i = indexOfMaxChild;
            }
            else
                return;
        }
    }
    public static void heapSort(int[] arr){
        buildHeap(arr);
        for (int i=arr.length-1;i>=1;i--) {
            swapInArray(arr,i,0);
            rebuild(arr,i);
        }
    }

}
