package chap02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int[] primeArr = new int[25];
		int numPrime = 0;
		for (int num = 2;num <= 50;num++) {
			if (isPrime(num, primeArr, numPrime)) {
				primeArr[numPrime++] = num;
				System.out.print(num + " ");
			}
		}
	}

	public static boolean isPrime(int n, int[] primeArr, int numPrime) {

		for (int i = 0; i < numPrime - 1; i++) {
			if (n % primeArr[i] == 0)
				return false;
		}
		return true;
	}

	public static boolean isPrime(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
