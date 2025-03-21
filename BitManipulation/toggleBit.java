import java.util.Scanner;

public class toggleBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.:");
        int n=sc.nextInt();
        System.out.println("Enter the bit to Toggle:");
        int i=sc.nextInt();

        int x=1<<i;

        int m=n^x;

        System.out.println(m);
        sc.close();
    }
}
