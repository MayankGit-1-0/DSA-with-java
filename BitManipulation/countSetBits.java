import java.util.Scanner;

public class countSetBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=n;
        int count=0;

        // Approach 1

        while(n!=0){
            count+=n&1;
            n=n>>1;

        }
        
        // Approach 2
        int cnt=0;
        while(k!=0){
            k=k&k-1;
            cnt++;
        }
        System.out.println(cnt);
        System.out.println(count);
        sc.close();
    }
}
