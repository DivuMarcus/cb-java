import java.util.Scanner;
public class OddEvenSum {
    public static void main(String[] args) {
        Scanner oe=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=oe.nextInt();
        int even=0;
        int odd=0;
        int c=0;
        while(n>0){
         int rem=n%10;
         if(c%2==0)
             even=even+rem;
         else
             odd=odd+rem;
         n=n/10;
         c=c+1;
         }
        System.out.println(odd);
        System.out.println(even);
    }
}
