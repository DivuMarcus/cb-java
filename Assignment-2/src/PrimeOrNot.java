import java.util.Scanner;
public class PrimeOrNot
{
    public static void main(String[] args)
    {
        Scanner prime=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=prime.nextInt();
        for (int i = 2; i <x ; i++)
        {
            if(x%i==0) {
                System.out.println("Not a prime number");
                break;
            }
            else
            System.out.println("Prime number!");
            break;

        }
    }
}
