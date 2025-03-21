import java.util.Scanner;

public class powerOf2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int m=n&n-1;
        if(m==0) System.out.println(true);
        else System.out.println(false);
        sc.close();
    }
}
