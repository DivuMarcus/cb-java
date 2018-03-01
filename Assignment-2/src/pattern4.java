import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        Scanner pat=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int r=pat.nextInt();
        int a=-1;
        int b=1;
        int c;
        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <=i ; j++) {
              c=a+b;
              a=b;
              b=c;
                System.out.print(c);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
