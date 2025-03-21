import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int deci=0;
        for(int i=0;i<s.length();i++){
            int m=s.charAt(s.length()-i-1)-'0';
            deci+=m*Math.pow(2,i);
        }
        System.out.println(deci);
        sc.close();
    }
}
