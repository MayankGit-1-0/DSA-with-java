import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class subset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int subset=1<<n;
        for(int i=0;i<subset;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                int k=i & (1<<j);
                if(k!=0){
                    list.add(arr[j]);
                }
                
            }
            System.out.println(list);
        }
        sc.close();

    }
}
