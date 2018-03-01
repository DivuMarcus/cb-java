import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        Scanner fibo=new Scanner(System.in);
        System.out.println("Enter the range of the series");
        int n=fibo.nextInt();
        int a=-1;
        int b=1;
        for (int i = 0; i <n-1 ; i++) {
            int c=a+b;
            if(c<n) {
                System.out.println(c);
                a = b;
                b = c;
            }


        }
    }
}

