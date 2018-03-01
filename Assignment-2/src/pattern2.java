import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner pat=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int r=pat.nextInt();
        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(j==1||j==i) {
                    System.out.print(i);
                    System.out.print(" ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
