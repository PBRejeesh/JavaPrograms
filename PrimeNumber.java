package com.db.integer;

import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {

		int limit = 100;
		System.out.println("Prime Number is : ");
		for (int i = 1; i <= limit; i++) {
			if (isPrime(i))
				System.out.print(" " + i);
		}

	}

	public static boolean isPrime(int num) {
		return IntStream.rangeClosed(2, num / 2).noneMatch(i -> num % i == 0);
	}

}
