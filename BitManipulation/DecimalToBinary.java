import java.util.Scanner;

public class decimalToBinary {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(n!=0){
            if(n%2==1){
                sb.append(1);
            }
            else{
                sb.append(0);
            }
            n=n/2;

        }
        // String s=sb.toString();
        // for(int i=s.length()-1;i>=0;i--){
        //     System.out.print(s.charAt(i));
        // }
        System.out.println(sb.reverse().toString());
        
        sc.close();
    }
}