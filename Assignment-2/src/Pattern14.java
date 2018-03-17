import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {

        System.out.println("Enter the No. Of Rows");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int c = (n * 2 - 1);
        int b = (c / 2) + 1;
        int d = b;
        int e = b;
        int count=0;
        int g;
        int h = 0;
        for (int i = 0; i < n; i++) {
            g = i + 1;
            for (int j = 1; j <= c; j++) {
                if (j <= d && j >= e) {
                    if (j <= b && j >= e) {
                        System.out.print(g);
                        g = g + 1;
                    } else {
                        if (j == b + 1) {
                            h = g - 2;
                            System.out.print(h);
                        } else {
                            h= h- 1;
                            System.out.print(h);
                        }
                    }
                } else {
                    System.out.print(" ");
                }
            }
            d = d + 1;
            e = e - 1;
            System.out.println();
        }
        d=c-1;
        e=2;
        int f=n-1;
        for(int i=0;i<c-n;i++){
            for(int j=1;j<=c;j++)
            {
              if(j>=e&&j<=d){
                  if(j>=e&&j<=b){
                      System.out.print(f);
                      f=f+1;
                  }
                  else{
                      if(j==b+1){
                          f=f-2;
                          System.out.print(f);
                      }
                      else{
                          f=f-1;
                          System.out.print(f);
                  }

                  }

              }
              else {
                  System.out.print(" ");
              }
            }
            System.out.println();
            e=e+1;
            d=d-1;
            f=f-1;
        }
    }
}



