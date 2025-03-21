import java.util.Scanner;

public class setBitCheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.:");
        int n=sc.nextInt();
        int k=n;
        System.out.println("Enter the bit to check:");
        int i=sc.nextInt();

        // using left shift operator
        int x=1<<i; 
        
        // using right shift operator
        int l=k>>i;

        int r=l&1; // for right shift

        int m=n&x; // for left shift

        if(m==0 && r==0) System.out.println("False");
        else System.out.println("True");
        sc.close();
    }
}
