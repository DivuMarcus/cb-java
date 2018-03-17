import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner gcd=new Scanner(System.in);
        System.out.println("Enter number one:");
        int n1=gcd.nextInt();
        System.out.println("Enter number two ");
        int n2=gcd.nextInt();
        System.out.println("GCD is: "+gcd(n1,n2));
    }
    public static int gcd(int n1, int n2){
        int gcd=1;
        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }
        return gcd;
    }
}
