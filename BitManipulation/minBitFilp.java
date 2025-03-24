import java.util.Scanner;

public class minBitFilp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=n^m;
        System.out.println(CountSetBits(x));
        sc.close();
    }
    public static int CountSetBits(int x){
        int count=0;
        while(x!=0){
            int m=x&1;
            count+=m;
            x=x>>1;
        }
        return count;
    }
}
