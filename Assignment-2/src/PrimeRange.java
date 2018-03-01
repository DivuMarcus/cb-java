import java.util.Scanner;
public class PrimeRange {
    public static void main(String[] args) {
        Scanner range=new Scanner(System.in);
        System.out.println("Enter the upper range");
        int n=range.nextInt();
        int c=0;
        for (int i = 2; i <=n ; i++) {
            c=0;
            for (int j = 2; j <i ; j++) {
                if (i%j==0)
                    c=c+1;
                }
            if(c==0)
                System.out.println(i);
        }
    }
}
