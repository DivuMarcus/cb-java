import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner fibo=new Scanner(System.in);
        System.out.println("Enter the range of the series");
        int n=fibo.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i <n-1 ; i++) {
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
