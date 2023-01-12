import java.util.Scanner;

/*
 * @author : Rejeesh
 * 
 * Fibonacci number 
 * Example output -> 0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 
 *
 **/

public class Fibonacci {

	public static void main(String[] args) {

		Fibonacci fib = new Fibonacci();
		int limit = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter limit:");
		limit = in.nextInt();

		System.out.println("The list of first " + limit + " terms in the Fibonacci Sequence is: ");

		if (limit >= 0)
			System.out.println("F0 -> " + 0);
		else
			System.err.println("Invalid Input");

		for (int i = 1; i <= limit; i++) {

			System.out.println("F" + i + " -> " + fib.fibonacci(i));
		}

		System.out.println("********");
	}

	public int fibonacci(int num) {

		int f1 = 1;
		int f2 = 1;
		int temp = 0;

		if (num == 1 || num == 2)
			return 1;

		for (int j = 3; j <= num; j++) {
			temp = f2;
			f2 = f1 + f2;
			f1 = temp;
		}
		return f2;
	}

}



