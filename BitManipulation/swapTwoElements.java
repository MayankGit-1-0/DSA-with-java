import java.util.Scanner;

public class swapTwoElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.printf("The values before swap is %d , %d\n",n,m);
        n=n^m;
        m=n^m;
        n=n^m;
        System.out.printf("The values after swap is %d , %d",n,m);
        sc.close();
    }
}
