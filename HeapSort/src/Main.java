import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++)
            a[i] = sc.nextInt();
        HeapSort.heapSort(a);
        for (int i=0;i<n;i++)
            System.out.print(a[i] +" ");
    }
}
