import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class Pattern13 {
    public static void main(String[] args) {
        System.out.println("Enter the No. Of Rows");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int c = (n * 2 - 1);
        int b = (c / 2) + 1;
        int d = b;
        int e = b;
        int g;
        int h =0;
        for (int i = 0; i < n; i++) {
            g=i+1;
            for (int j = 1; j <= c; j++) {
                if (j <= d && j >= e)
                {
                    if (j <=b  && j >= e)
                    {
                        System.out.print(g);
                        g=g+1;
                    }
                    else
                        {
                            if(j == b + 1)
                            {
                                h=g-2;
                                System.out.print(h);
                            }
                          else
                              {
                                h=h-1;
                                System.out.print(h);
                              }
                        }
                }
                else {
                    System.out.print(" ");
                }
            }
            d = d + 1;
            e = e - 1;
            System.out.println();
        }
    }
}
