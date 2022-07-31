package com.db.integer;

public class PrimeNumberGeration {

	public static void main(String[] args) {

		int limit = 100;
		int num = 0;

		System.out.println("Prime number is : ");

		for (int i = 1; i <= limit; i++) {
			int count = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(" " + i);
			}
		}

	}

}
