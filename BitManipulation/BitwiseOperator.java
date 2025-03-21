import java.util.Scanner;

public class bitWiseOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=n&m;              //n=13=>1101
                                //m=7=> 0111
                                // x=>  0101=>5
        System.out.println(x);
        x=n|m;                  //n=13=>1101
                                //m=7=> 0111
                                //x=>   1111=>15
        System.out.println(x);
        x=n>>1;                  //n=13=>1101=>0110=>6 Right shift
        System.out.println(x);
        x=n>>3;                   //n=13=>1101=>0001=>1
        System.out.println(x);
        x=m<<2;                   //m=7=>0111=>0011100=> Left shift
        System.out.println(x);
        x=m^n;                     // xor(^) gives when same bit results->1 else gives-> 0;
        System.out.println(x);
        sc.close();
    }
}
