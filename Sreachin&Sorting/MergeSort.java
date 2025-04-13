import java.util.Scanner;

public class MergeSort {
    public static int[] mergeSort(int[] arr,int start,int end){
        if(start>=end) return new int[]{arr[start]};
        int mid=(start+end)>>1;
        
        int[] res1=mergeSort(arr,start,mid);
        int[] res2=mergeSort(arr, mid+1, end);
        int[] res=merge(res1,res2);
        return res;
    }
    // Merge function to combine two sorted arrays
    public static int[] merge(int[] left, int[] right) {
        int n = left.length;
        int m = right.length;
        int[] merged = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Merge the two arrays into the result array
        while (i < n && j < m) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        // Copy remaining elements from left array, if any
        while (i < n) {
            merged[k++] = left[i++];
        }

        // Copy remaining elements from right array, if any
        while (j < m) {
            merged[k++] = right[j++];
        }

        return merged;
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        arr=mergeSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
}