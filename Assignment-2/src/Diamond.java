import java.util.Scanner;
public class  Diamond {


    public static void main(String[] args) {
        System.out.println("Enter N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        c=(n/2)+1;
        int d=c;
        int e=0;
        int g=n-d+1;
        int f=0;
        for (int i = 1; i <= d+1; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= d && j <= c) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            c = c + 1;
            d = d - 1;
        }
        e = 1;
        f = n;
        for (int i = 1; i <= n-d; i++) {
            for (int k = 1; k <=n ; k++) {
                if (k >= e && k <= f) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
            e =  e+ 1;
            f = f - 1;

        }
    }
}