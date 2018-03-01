import java.util.Scanner;
public class  InvertDiamond {


    public static void main(String[] args) {
        System.out.println("Enter N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=(n/2)+1;
        int d=a+1;
        int g=a+1;
        int e=0;
        int f=0;
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <= n+2; j++)
            {
                if (j <=g && j >= d)
                {
                    System.out.print(" ");

                } else
                    {
                    System.out.print("*");
                }
            }
            System.out.println();
            g = g + 1;
            d = d - 1;
        }
          e = 3;
          f = n;
        for (int i = 1; i <= n-a; i++)
        {
            for (int k = 1; k <=n+2 ; k++)
            {
                if (k >=e && k <= f)
                {
                    System.out.print(" ");
                }
                else
                    {
                    System.out.print("*");

                }
            }
            System.out.println();
            e = e+1;
            f = f-1;

        }

    }
}