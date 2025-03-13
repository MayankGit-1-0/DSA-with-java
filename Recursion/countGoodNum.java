import java.util.Scanner;

public class countGoodNum {
        static long mod = (long) 1e9 + 7; // Create A long Modulo
    
        public static int countGoodNumbers(long n) {
            long odd = n / 2;             // count no.of odds
            long even = (n + 1) / 2;      // count no.of evens
            return (int) ((pow(5, even) * pow(4, odd)) % mod); // give result in int ny using % operator
        }
    
        public static long pow(long x, long n) { // pow function to get long result
            if (n == 0) return 1;
            long half = pow(x, n / 2);
            if (n % 2 == 0) return (half * half) % mod;
            else return (half * half * x) % mod;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int res=countGoodNumbers(n);
        System.out.println(res);
        sc.close();
    }
}