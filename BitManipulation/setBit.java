import java.util.Scanner;

public class setBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.:");
        int n=sc.nextInt();
        System.out.println("Enter the bit to change:");
        int i=sc.nextInt();

        int x=1<<i;

        int m=n|x;

        System.out.println(m);

        sc.close();
    }
}
