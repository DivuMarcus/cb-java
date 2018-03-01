import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner pat=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=pat.nextInt();
        int c=1;
        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(c);
                System.out.print(" ");
                c=c+1;
            }
            System.out.println();
         }
    }
}
