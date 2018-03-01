import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner rev=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=rev.nextInt();
        int c=0;
        while (n>0){
            int rem=n%10;
            c=(c*10)+rem;
            n=n/10;
        }
        System.out.println(c);
    }
}
