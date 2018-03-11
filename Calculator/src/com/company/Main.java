
package com.company;
import java.util.*;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		System.out.println("Enter The Operation");
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		int c;
		first:
		{
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
			{
					Scanner first=new Scanner(System.in);
					int a=first.nextInt();
					Scanner second=new Scanner(System.in);
					int b=second.nextInt();
					if(ch=='+')
					{
						c=a+b;
						System.out.println(c);
					}
					if(ch=='-')
					{
						c=a-b;
						System.out.println(c);
					}
					if(ch=='*')
					{
						c=a*b;
						System.out.println(c);
					}
					if(ch=='/')
					{
						c=a/b;
						System.out.println(c);
					}

			}
			else if (ch=='x'||ch=='X')
			{
				break first;
			}
			else
				{
				System.out.println("Invalid operation. Try again.");
			    }
		}

	}
}
