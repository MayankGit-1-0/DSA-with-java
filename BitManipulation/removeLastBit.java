import java.util.Scanner;

public class removeLastBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int m=n&n-1;

        System.out.println(m);
        sc.close();
    }
}
